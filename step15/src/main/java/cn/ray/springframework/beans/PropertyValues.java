package cn.ray.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JOJO
 * @date 2022/8/17 14:56
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue){
        this.propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
