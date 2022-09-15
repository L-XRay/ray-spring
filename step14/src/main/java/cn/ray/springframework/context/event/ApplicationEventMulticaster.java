package cn.ray.springframework.context.event;

import cn.ray.springframework.context.ApplicationEvent;
import cn.ray.springframework.context.ApplicationListener;

/**
 * @author JOJO
 * @date 2022/9/1 21:16
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
