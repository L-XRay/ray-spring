package cn.ray.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author JOJO
 * @date 2022/9/6 19:29
 */
public interface Advisor {

    Advice getAdvice();
}
