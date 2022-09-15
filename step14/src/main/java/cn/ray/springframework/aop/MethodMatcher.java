package cn.ray.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author JOJO
 * @date 2022/9/4 20:32
 */
public interface MethodMatcher {

    /**
     * 检查表达式匹配范围内是否存在给定的目标类的给定方法
     * @param method
     * @param targetClass
     * @return
     */
    boolean matches(Method method, Class<?> targetClass);
}
