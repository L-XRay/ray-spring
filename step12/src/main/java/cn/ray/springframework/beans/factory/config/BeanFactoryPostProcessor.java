package cn.ray.springframework.beans.factory.config;

import cn.ray.springframework.beans.BeansException;
import cn.ray.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author JOJO
 * @date 2022/8/21 22:35
 * 允许自定义修改 BeanDefinition 信息
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
