package bsoft.lm.boot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author <a>liuming</a>
 * @Description: tomcat启动类
 * @date 2018年5月22日$ 23:14:17$
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BabySbreath.class);
    }
}
