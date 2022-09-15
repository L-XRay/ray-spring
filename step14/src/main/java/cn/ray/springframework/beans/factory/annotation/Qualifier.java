package cn.ray.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author JOJO
 * @date 2022/9/15 17:50
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER,ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";

}
