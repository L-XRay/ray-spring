package cn.ray.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author JOJO
 * @date 2022/9/6 09:40
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Object target,Method method, Object[] args) throws Throwable;

}
