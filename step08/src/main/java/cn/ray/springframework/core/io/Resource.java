package cn.ray.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author JOJO
 * @date 2022/8/18 17:15
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
