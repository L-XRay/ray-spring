package cn.ray.springframework.context.support;

import cn.ray.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.ray.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author JOJO
 * @date 2022/8/21 23:22
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
