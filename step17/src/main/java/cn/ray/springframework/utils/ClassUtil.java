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

    /**
     * Check whether the specified class is a CGLIB-generated class.
     * 检查指定的类是否为cglib生成的类。
     * @param clazz the class to check
     */
    public static boolean isCglibProxyClass(Class<?> clazz) {
        return (clazz != null && isCglibProxyClassName(clazz.getName()));
    }

    /**
     * 检查指定的类名是否为cglib生成的类。
     * @param className the class name to check
     */
    public static boolean isCglibProxyClassName(String className) {
        return (className != null && className.contains("$$"));
    }
}
