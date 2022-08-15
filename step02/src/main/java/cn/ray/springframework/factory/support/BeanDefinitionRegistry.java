package cn.ray.springframework.factory.support;

import cn.ray.springframework.factory.config.BeanDefinition;

/**
 * @author JOJO
 * @date 2022/8/15 17:58
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
