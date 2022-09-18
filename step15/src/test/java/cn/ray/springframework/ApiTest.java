package cn.ray.springframework;

import cn.ray.springframework.bean.IUserService;
import cn.ray.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_autoProxy() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}
