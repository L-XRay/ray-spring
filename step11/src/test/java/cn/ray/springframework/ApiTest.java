package cn.ray.springframework;

import cn.ray.springframework.aop.AdvisedSupport;
import cn.ray.springframework.aop.MethodMatcher;
import cn.ray.springframework.aop.TargetSource;
import cn.ray.springframework.aop.aspectj.AspectJExpressionPointcut;
import cn.ray.springframework.aop.framework.Cglib2AopProxy;
import cn.ray.springframework.aop.framework.JdkDynamicAopProxy;
import cn.ray.springframework.bean.IUserService;
import cn.ray.springframework.bean.UserService;
import cn.ray.springframework.bean.UserServiceInterceptor;
import net.sf.cglib.proxy.MethodInterceptor;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author JOJO
 * @date 2022/9/4 20:15
 */
public class ApiTest {

    @Test
    public void test_aop() throws NoSuchMethodException {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* cn.ray.springframework.bean.UserService.*(..))");

        Class<UserService> clazz = UserService.class;
        Method method = clazz.getDeclaredMethod("queryUserInfo");

        System.out.println(pointcut.matches(clazz));
        System.out.println(pointcut.matches(method, clazz));
    }

    @Test
    public void test_dynamic() {
        // 目标对象
        IUserService userService = new UserService();

        // 组装代理信息
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setTargetSource(new TargetSource(userService));
        advisedSupport.setMethodInterceptor(new UserServiceInterceptor());
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* cn.ray.springframework.bean.IUserService.*(..))"));

        // 代理对象(JdkDynamicAopProxy)
        IUserService proxy_jdk = (IUserService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        // 测试调用
        System.out.println("JDK测试结果：" + proxy_jdk.queryUserInfo()+"\n");

        // 代理对象(Cglib2AopProxy)
        IUserService proxy_cglib = (IUserService) new Cglib2AopProxy(advisedSupport).getProxy();
        // 测试调用
        System.out.println("Cglib测试结果：" + proxy_cglib.register("JOJO"));
    }

}
