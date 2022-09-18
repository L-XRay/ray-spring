package cn.ray.springframework.bean;

import cn.ray.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class UserServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Object target, Method method, Object[] args) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }

}
