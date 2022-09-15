package cn.ray.springframework.beans.factory;

import cn.ray.springframework.beans.BeansException;
import cn.ray.springframework.beans.PropertyValue;
import cn.ray.springframework.beans.PropertyValues;
import cn.ray.springframework.beans.factory.config.BeanDefinition;
import cn.ray.springframework.beans.factory.config.BeanFactoryPostProcessor;
import cn.ray.springframework.core.io.DefaultResourceLoader;
import cn.ray.springframework.core.io.Resource;
import cn.ray.springframework.utils.StringValueResolver;

import java.io.IOException;
import java.util.Properties;

/**
 * @author JOJO
 * @date 2022/9/11 20:06
 */
public class PropertyPlaceholderConfigurer implements BeanFactoryPostProcessor {

    /**
     * Default placeholder prefix: {@value}
     */
    public static final String DEFAULT_PLACEHOLDER_PREFIX = "${";

    /**
     * Default placeholder suffix: {@value}
     */
    public static final String DEFAULT_PLACEHOLDER_SUFFIX = "}";

    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        try {
            // 加载属性文件
            DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
            Resource resource = resourceLoader.getResource(location);
            Properties properties = new Properties();
            properties.load(resource.getInputStream());

            // 占位符替换属性值
            String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
            for (String beanName : beanDefinitionNames) {
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);

                PropertyValues propertyValues = beanDefinition.getPropertyValues();
                for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                    Object value = propertyValue.getValue();
                    if (!(value instanceof String)) continue;
                    value = resolvePlaceholder((String) value,properties);
                    propertyValues.addPropertyValue(new PropertyValue(propertyValue.getName(),value));
                }
            }

            // 向容器中添加字符串解析器，供解析@Value注解使用
            StringValueResolver stringValueResolver = new PlaceholderResolvingStringValueResolver(properties);
            beanFactory.addEmbeddedValueResolver(stringValueResolver);

        } catch (IOException e) {
            throw new BeansException("Could not load properties", e);
        }
    }

    /**
     * 占位符替换属性值
     * @param value bean属性定义的value
     * @param properties 配置文件
     * @return 配置文件中 指定 key 的 value
     */
    private String resolvePlaceholder(String value, Properties properties) {
        String strVal = value;
        StringBuilder buffer = new StringBuilder(strVal);
        int startIdx = strVal.indexOf(DEFAULT_PLACEHOLDER_PREFIX);
        int stopIdx = strVal.indexOf(DEFAULT_PLACEHOLDER_SUFFIX);
        // 如果存在占位符，从配置文件中提取属性值
        if (startIdx != -1 && stopIdx != -1 && startIdx < stopIdx) {
            // 占位符中 的 key
            String propKey = strVal.substring(startIdx + 2, stopIdx);
            // 从配置文件中 拿到指定 key 的 value
            String propVal = properties.getProperty(propKey);
            buffer.replace(startIdx, stopIdx + 1, propVal);
        }
        return buffer.toString();
    }

    private class PlaceholderResolvingStringValueResolver implements StringValueResolver {

        private final Properties properties;

        public PlaceholderResolvingStringValueResolver(Properties properties) {
            this.properties = properties;
        }

        @Override
        public String resolveStringValue(String strVal) {
            return PropertyPlaceholderConfigurer.this.resolvePlaceholder(strVal, properties);
        }

    }
}
