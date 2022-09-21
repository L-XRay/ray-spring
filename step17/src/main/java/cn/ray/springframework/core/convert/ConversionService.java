package cn.ray.springframework.core.convert;

import com.sun.istack.internal.Nullable;

/**
 * @author JOJO
 * @date 2022/9/21 20:04
 */
public interface ConversionService {

    /** 是否能进行类型转换 */
    boolean canConvert(@Nullable Class<?> sourceType, Class<?> targetType);

    /** 转换类型. */
    <T> T convert(Object source, Class<T> targetType);

}
