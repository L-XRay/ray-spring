package cn.ray.springframework.beans.factory.support;

import cn.ray.springframework.beans.BeansException;
import cn.ray.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author JOJO
 * @date 2022/8/16 19:59
 * <p>
 * Bean 实例化策略接口
 * </p>
 */
@SuppressWarnings({"rawtypes"})
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
