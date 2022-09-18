package cn.ray.springframework.aop.framework;

import cn.ray.springframework.aop.AdvisedSupport;

/**
 * @author JOJO
 * @date 2022/9/6 19:55
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    // 选择代理方式
    public AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()){
            return new Cglib2AopProxy(advisedSupport);
        }
        return new JdkDynamicAopProxy(advisedSupport);
    }
}
