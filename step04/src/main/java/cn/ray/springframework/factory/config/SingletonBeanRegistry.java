package cn.ray.springframework.factory.config;

/**
 * @author JOJO
 * @date 2022/8/15 17:13
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
