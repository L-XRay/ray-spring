package cn.ray.springframework.aop.aspectj;

import cn.ray.springframework.aop.Pointcut;
import cn.ray.springframework.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * @author JOJO
 * @date 2022/9/6 19:38
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    // 切面
    private AspectJExpressionPointcut pointcut;

    // 通知: 具体的拦截方法
    private Advice advice;

    // 表达式
    private String expression;

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (pointcut == null) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }
}
