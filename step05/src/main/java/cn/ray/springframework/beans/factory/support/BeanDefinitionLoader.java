package cn.ray.springframework.beans.factory.support;

import cn.ray.springframework.beans.BeansException;
import cn.ray.springframework.core.io.Resource;
import cn.ray.springframework.core.io.ResourceLoader;

/**
 * @author JOJO
 * @date 2022/8/18 18:05
 */
public interface BeanDefinitionLoader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
