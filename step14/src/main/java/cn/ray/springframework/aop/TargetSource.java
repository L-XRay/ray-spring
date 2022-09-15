package cn.ray.springframework.aop;

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
        return this.target.getClass().getInterfaces();
    }

    public Object getTarget(){
        return this.target;
    }

}
