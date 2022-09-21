package cn.ray.springframework.context.event;

import cn.ray.springframework.beans.factory.BeanFactory;
import cn.ray.springframework.context.ApplicationEvent;
import cn.ray.springframework.context.ApplicationListener;

/**
 * @author JOJO
 * @date 2022/9/1 21:50
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
