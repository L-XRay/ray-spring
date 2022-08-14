package cn.ray.springframework;

import java.util.HashMap;

/**
 * @author JOJO
 * @date 2022/8/14 17:34
 */
public class BeanFactory {

    private HashMap<String,BeanDefinition> beanDefinitionHashMap = new HashMap<>();

    public Object getBean(String name){
        return beanDefinitionHashMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionHashMap.put(name,beanDefinition);
    }
}
