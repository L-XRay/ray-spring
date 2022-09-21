package cn.ray.springframework.core.convert.converter;

/**
 * @author JOJO
 * @date 2022/9/21 19:49
 */
public interface ConverterRegistry {

    /**
     * 注册转换器
     * @param converter
     */
    void addConverter(Converter<?, ?> converter);

    /**
     * 注册通用转换器
     */
    void addConverter(GenericConverter converter);

    /**
     * 注册转换器工厂
     */
    void addConverterFactory(ConverterFactory<?, ?> converterFactory);
}
