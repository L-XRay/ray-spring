package cn.ray.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author JOJO
 * @date 2022/9/11 21:02
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";

}
