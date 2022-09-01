package cn.ray.springframework.context;

import java.util.EventListener;

/**
 * @author JOJO
 * @date 2022/9/1 21:20
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
