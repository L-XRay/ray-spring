package cn.ray.springframework.beans.factory.support;

import cn.ray.springframework.core.io.DefaultResourceLoader;
import cn.ray.springframework.core.io.ResourceLoader;

/**
 * @author JOJO
 * @date 2022/8/18 18:07
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionLoader{

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
