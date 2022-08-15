package cn.ray.springframework.factory.support;

import cn.ray.springframework.BeansException;
import cn.ray.springframework.factory.config.BeanDefinition;

/**
 * @author JOJO
 * @date 2022/8/15 17:47
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed");
        }
        addSingleton(beanName,bean);
        return bean;
    }
}
