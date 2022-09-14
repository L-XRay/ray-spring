package cn.ray.springframework.context.event;

import cn.ray.springframework.context.ApplicationContext;
import cn.ray.springframework.context.ApplicationEvent;

/**
 * @author JOJO
 * @date 2022/9/1 21:07
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext(){
        return (ApplicationContext) getSource();
    }
}
