package cn.ray.springframework.factory;

import cn.ray.springframework.BeansException;

/**
 * @author JOJO
 * @date 2022/8/15 17:35
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName,Object... args) throws BeansException;
}
