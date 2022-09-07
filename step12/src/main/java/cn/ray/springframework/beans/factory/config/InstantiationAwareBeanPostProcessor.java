package cn.ray.springframework.beans.factory.config;

import cn.ray.springframework.beans.BeansException;

/**
 * @author JOJO
 * @date 2022/9/6 20:14
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

}
