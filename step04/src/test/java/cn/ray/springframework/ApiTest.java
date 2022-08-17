package cn.ray.springframework;

import cn.ray.springframework.bean.UserDao;
import cn.ray.springframework.bean.UserService;
import cn.ray.springframework.factory.config.BeanDefinition;
import cn.ray.springframework.factory.config.BeanReference;
import cn.ray.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author JOJO
 * @date 2022/8/17 15:26
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10002"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
