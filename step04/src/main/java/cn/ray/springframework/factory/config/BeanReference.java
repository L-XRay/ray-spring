package cn.ray.springframework.factory.config;

/**
 * @author JOJO
 * @date 2022/8/17 15:13
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
