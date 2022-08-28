package cn.ray.springframework.beans.factory.config;

import cn.ray.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author JOJO
 * @date 2022/8/18 19:34
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();
}
