package jsen.config;

import jsen.pojo.User;
import org.springframework.context.annotation.*;

/**
 * @Configuration 代表这是一个配置类  配置类 相当于原来的beans,xml
 * 本身就是一个@Conponent
 * @ComponentScan("jsen.pojo") 扫描 哪个包下  <context:component-scan base-package="jsen"></context:component-scan>
 *
 * @Import(JsenConfig2.class) 导入另一个配置文件
 */
@Configuration
@ComponentScan("jsen.pojo")
@Import(JsenConfig2.class)
public class JsenConfig {

    /**
     * 注册一个bean ==>  <bean id="getUser" class="jsen.pojo.User">
     * 方法名 ==> id
     * 返回值 ==> class
     */

    @Bean
    @Scope("prototype")
    public User getUser() {
        return new User();
    }
}
