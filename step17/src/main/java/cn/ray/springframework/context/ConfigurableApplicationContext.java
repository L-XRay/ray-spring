package cn.ray.springframework.context;

import cn.ray.springframework.beans.BeansException;

/**
 * @author JOJO
 * @date 2022/8/21 22:43
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();

}
