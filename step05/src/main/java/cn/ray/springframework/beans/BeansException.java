package cn.ray.springframework.beans;

/**
 * @author JOJO
 * @date 2022/8/15 17:33
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
