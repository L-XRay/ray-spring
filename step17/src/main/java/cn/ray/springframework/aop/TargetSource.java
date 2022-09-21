package cn.ray.springframework.aop;

import cn.ray.springframework.utils.ClassUtil;

/**
 * @author JOJO
 * @date 2022/9/4 22:19
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Class<?>[] getTargetClass(){
        Class<?> clazz = this.target.getClass();
        clazz = ClassUtil.isCglibProxyClass(clazz) ? clazz.getSuperclass() : clazz;
        return clazz.getInterfaces();
    }

    public Object getTarget(){
        return this.target;
    }

}
