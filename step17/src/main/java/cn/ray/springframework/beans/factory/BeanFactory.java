package cn.ray.springframework.beans.factory;

import cn.ray.springframework.beans.BeansException;

/**
 * @author JOJO
 * @date 2022/8/15 17:35
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName,Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;

    boolean containsBean(String name);
}
