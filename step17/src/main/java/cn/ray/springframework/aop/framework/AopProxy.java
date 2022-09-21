package cn.ray.springframework.aop.framework;

/**
 * @author JOJO
 * @date 2022/9/4 22:21
 * 抽象 代理，方便管理两种代理方式：JDK 和 Cglib
 */
public interface AopProxy {

    Object getProxy();
}
