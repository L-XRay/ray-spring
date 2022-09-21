package cn.ray.springframework.bean;

import cn.ray.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SpouseAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Object target, Method method, Object[] args) throws Throwable {
        System.out.println("关怀小两口(切面)：" + method);
    }
}
