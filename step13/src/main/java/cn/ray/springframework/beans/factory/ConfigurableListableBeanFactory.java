package cn.ray.springframework.beans.factory;

import cn.ray.springframework.beans.BeansException;
import cn.ray.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.ray.springframework.beans.factory.config.BeanDefinition;
import cn.ray.springframework.beans.factory.config.BeanPostProcessor;
import cn.ray.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author JOJO
 * @date 2022/8/18 19:36
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
