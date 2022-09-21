package cn.ray.springframework.bean;

import cn.ray.springframework.beans.factory.annotation.Autowired;
import cn.ray.springframework.beans.factory.annotation.Qualifier;

public class Wife {

    private Husband husband;

    private IMother mother; // 婆婆

    public String queryHusband() {
        return "Wife.husband、Mother.callMother：" + mother.callMother();
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public IMother getMother() {
        return mother;
    }

    public void setMother(IMother mother) {
        this.mother = mother;
    }

}
