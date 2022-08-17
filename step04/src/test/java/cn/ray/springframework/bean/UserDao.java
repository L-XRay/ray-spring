package cn.ray.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JOJO
 * @date 2022/8/17 15:27
 */
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小傅哥");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
