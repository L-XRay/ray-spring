package cn.ray.springframework;

/**
 * @author JOJO
 * @date 2022/8/14 17:32
 */
public class BeanDefinition {

    private Object Bean;

    public BeanDefinition(Object bean) {
        Bean = bean;
    }

    public Object getBean() {
        return Bean;
    }

}
