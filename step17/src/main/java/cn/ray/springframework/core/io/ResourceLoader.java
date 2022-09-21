package cn.ray.springframework.core.io;

/**
 * @author JOJO
 * @date 2022/8/18 17:56
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
