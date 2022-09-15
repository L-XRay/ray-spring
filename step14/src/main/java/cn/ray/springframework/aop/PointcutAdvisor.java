package cn.ray.springframework.aop;

/**
 * @author JOJO
 * @date 2022/9/6 19:33
 */
public interface PointcutAdvisor extends Advisor{

    Pointcut getPointcut();
}
