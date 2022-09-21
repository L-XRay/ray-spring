package cn.ray.springframework.core.convert.converter;

/**
 * @author JOJO
 * @date 2022/9/21 19:47
 */
public interface ConverterFactory<S,R> {
    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
