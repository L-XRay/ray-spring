package cn.ray.springframework.context;

import java.util.EventObject;

/**
 * @author JOJO
 * @date 2022/9/1 20:56
 */
public abstract class ApplicationEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }

}
