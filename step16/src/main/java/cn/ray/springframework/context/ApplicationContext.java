package cn.ray.springframework.context;

import cn.ray.springframework.beans.factory.HierarchicalBeanFactory;
import cn.ray.springframework.beans.factory.ListableBeanFactory;
import cn.ray.springframework.core.io.ResourceLoader;

/**
 * @author JOJO
 * @date 2022/8/21 22:40
 * 应用上下文
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
