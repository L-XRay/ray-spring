package cn.ray.springframework.context;

import cn.ray.springframework.beans.BeansException;
import cn.ray.springframework.beans.factory.Aware;

/**
 * @author JOJO
 * @date 2022/8/25 14:59
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
