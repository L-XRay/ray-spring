package cn.ray.springframework;

import cn.ray.springframework.aop.AdvisedSupport;
import cn.ray.springframework.aop.ClassFilter;
import cn.ray.springframework.aop.MethodMatcher;
import cn.ray.springframework.aop.TargetSource;
import cn.ray.springframework.aop.aspectj.AspectJExpressionPointcut;
import cn.ray.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import cn.ray.springframework.aop.framework.ProxyFactory;
import cn.ray.springframework.aop.framework.ReflectiveMethodInvocation;
import cn.ray.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import cn.ray.springframework.bean.IUserService;
import cn.ray.springframework.bean.UserService;
import cn.ray.springframework.bean.UserServiceBeforeAdvice;
import cn.ray.springframework.bean.UserServiceInterceptor;
import cn.ray.springframework.context.support.ClassPathXmlApplicationContext;
import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ApiTest {

    @Test
    public void test_aop() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}
