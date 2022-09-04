package cn.ray.springframework.beans.factory;

import cn.ray.springframework.beans.BeansException;

/**
 * @author JOJO
 * @date 2022/8/25 14:54
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
