package cn.ray.springframework.beans.factory;

/**
 * @author JOJO
 * @date 2022/8/25 14:57
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);

}
