package cn.ray.springframework.beans.factory;

/**
 * @author JOJO
 * @date 2022/8/28 15:58
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
