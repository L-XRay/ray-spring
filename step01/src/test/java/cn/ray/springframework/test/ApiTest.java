package cn.ray.springframework.test;

import cn.ray.springframework.BeanDefinition;
import cn.ray.springframework.BeanFactory;
import cn.ray.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author JOJO
 * @date 2022/8/14 17:51
 */
public class ApiTest {

    @Test
    public void test_beanFactory(){

        // 初始化Bean工厂
        BeanFactory beanFactory = new BeanFactory();

        // 定义 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        // 注册 bean
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        // 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();
    }

}
