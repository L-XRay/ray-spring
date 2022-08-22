package cn.ray.springframework.beans.factory.support;

import cn.ray.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author JOJO
 * @date 2022/8/15 17:24
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final static Map<String,Object> singletonObjects = new ConcurrentHashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjects.put(beanName,singletonObject);
    }
}
