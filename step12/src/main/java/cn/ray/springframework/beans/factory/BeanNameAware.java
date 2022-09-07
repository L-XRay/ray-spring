package cn.ray.springframework.beans.factory;

/**
 * @author JOJO
 * @date 2022/8/25 14:58
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}
