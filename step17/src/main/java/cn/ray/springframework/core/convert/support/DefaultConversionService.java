package cn.ray.springframework.core.convert.support;

import cn.ray.springframework.core.convert.converter.ConverterRegistry;

/**
 * @author JOJO
 * @date 2022/9/21 20:49
 */
public class DefaultConversionService extends GenericConversionService{
    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }
}
