package cn.ray.springframework.utils;

/**
 * @author JOJO
 * @date 2022/8/18 17:18
 */
public class ClassUtil {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }
        catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
            // 无法访问线程上下文ClassLoader -回退到系统类加载器…
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            // 没有线程上下文类加载器->使用该类的类加载器。
            cl = ClassUtil.class.getClassLoader();
        }
        return cl;
    }

}
