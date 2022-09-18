package cn.ray.springframework.context.support;

import cn.ray.springframework.beans.BeansException;
import cn.ray.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.ray.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author JOJO
 * @date 2022/8/21 23:19
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}
