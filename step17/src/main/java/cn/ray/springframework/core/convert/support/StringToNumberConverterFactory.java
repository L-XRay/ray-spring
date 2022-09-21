package cn.ray.springframework.core.convert.support;

import cn.ray.springframework.core.convert.converter.Converter;
import cn.ray.springframework.core.convert.converter.ConverterFactory;
import cn.ray.springframework.utils.NumberUtil;
import com.sun.istack.internal.Nullable;

/**
 * @author JOJO
 * @date 2022/9/21 20:50
 */
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtil.parseNumber(source, this.targetType);
        }
    }
}
