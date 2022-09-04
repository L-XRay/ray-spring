package cn.ray.springframework.aop;

/**
 * @author JOJO
 * @date 2022/9/4 20:34
 */
public interface PointCut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
