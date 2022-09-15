package cn.ray.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author JOJO
 * @date 2022/9/15 18:14
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Documented
public @interface Value {

    String value();
}
