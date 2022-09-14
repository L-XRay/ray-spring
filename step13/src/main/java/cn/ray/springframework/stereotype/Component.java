package cn.ray.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author JOJO
 * @date 2022/9/11 21:13
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";

}
