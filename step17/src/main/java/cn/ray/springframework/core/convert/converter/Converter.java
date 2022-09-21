package cn.ray.springframework.core.convert.converter;

/**
 * @author JOJO
 * @date 2022/9/21 19:42
 */
public interface Converter<S,T> {
    T convert(S source);
}
