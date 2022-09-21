package cn.ray.springframework.beans.factory;

import cn.ray.springframework.beans.BeansException;

/**
 * @author JOJO
 * @date 2022/9/19 18:08
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}