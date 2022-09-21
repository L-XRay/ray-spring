package cn.ray.springframework.beans.factory.config;

import cn.ray.springframework.beans.factory.HierarchicalBeanFactory;
import cn.ray.springframework.core.convert.ConversionService;
import cn.ray.springframework.utils.StringValueResolver;
import com.sun.istack.internal.Nullable;

/**
 * @author JOJO
 * @date 2022/8/18 19:34
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

    /**
     * 添加字符串解析器
     * @param valueResolver
     */
    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    /**
     * 解析给定的字符串
     * @param value
     * @return 解析后的字符串，可能为原值不变
     */
    String resolveEmbeddedValue(String value);

    void setConversionService(ConversionService conversionService);

    @Nullable
    ConversionService getConversionService();
}
