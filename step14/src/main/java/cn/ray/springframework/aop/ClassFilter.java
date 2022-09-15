package cn.ray.springframework.aop;

/**
 * @author JOJO
 * @date 2022/9/4 20:29
 */
public interface ClassFilter {

    /**
     * 判断切点是否应用于给定类、接口,
     * 检查表达式匹配范围内是否存在给定的目标类
     * @param clazz
     * @return
     */
    boolean matches(Class<?> clazz);
}
