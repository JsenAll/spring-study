package jsen.config;

import jsen.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Configuration 代表这是一个配置类  配置类 相当于原来的beans,xml
 *                本身就是一个@Conponent
 * @ComponentScan("jsen.pojo") 扫描 哪个包下  <context:component-scan base-package="jsen"></context:component-scan>
 */
@Configuration
@ComponentScan("jsen.pojo")
public class JsenConfig2 {

    @Bean
    public User user() {
        return new User();
    }
}
