package cn.ray.springframework;

import cn.ray.springframework.bean.UserService;
import cn.ray.springframework.factory.config.BeanDefinition;
import cn.ray.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author JOJO
 * @date 2022/8/14 17:51
 */
public class ApiTest {

    @Test
    public void test_beanFactory(){

        // 初始化Bean工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 定义 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        // 注册 bean
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        // 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService","Ray");

        userService.queryUserInfo();

    }

}
