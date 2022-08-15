package cn.ray.springframework;

/**
 * @author JOJO
 * @date 2022/8/15 17:35
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;
}
