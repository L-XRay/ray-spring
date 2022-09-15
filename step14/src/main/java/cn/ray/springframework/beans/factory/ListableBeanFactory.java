package cn.ray.springframework.beans.factory;

import cn.ray.springframework.beans.BeansException;

import java.util.Map;

/**
 * @author JOJO
 * @date 2022/8/18 19:29
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
