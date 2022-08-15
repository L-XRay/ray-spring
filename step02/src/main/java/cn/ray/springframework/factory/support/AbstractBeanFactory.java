package cn.ray.springframework.factory.support;

import cn.ray.springframework.BeanFactory;
import cn.ray.springframework.BeansException;
import cn.ray.springframework.factory.config.BeanDefinition;

/**
 * @author JOJO
 * @date 2022/8/15 17:31
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        Object bean = getSingleton(beanName);
        if(bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;
}
