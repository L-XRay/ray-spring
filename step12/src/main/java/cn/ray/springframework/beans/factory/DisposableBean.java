package cn.ray.springframework.beans.factory;

/**
 * @author JOJO
 * @date 2022/8/22 21:57
 */
public interface DisposableBean {

    void destroy() throws Exception;
    
}
