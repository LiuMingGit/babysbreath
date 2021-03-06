package bsoft.lm.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author <a>liuming</a>
 * @Description: 启动类
 * @date 2018年5月21日$ 22:19:12$
 */
@SpringBootApplication
@ComponentScan(basePackages = {"bsoft.lm"})
@EnableJpaRepositories(basePackages = {"bsoft.lm.interfaze"})
@EntityScan(basePackages = {"bsoft.lm.bean"})
public class BabySbreath extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BabySbreath.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BabySbreath.class,args);
    }
}
