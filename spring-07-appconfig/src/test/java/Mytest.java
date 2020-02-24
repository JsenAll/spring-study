import jsen.config.JsenConfig;
import jsen.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //如果完全使用配置类的方式去配置Spring 只能通过 AnnotationConfigApplicationContext 来获取容器 通过 配置类的Class对象进行加载
        ApplicationContext context = new AnnotationConfigApplicationContext(JsenConfig.class);
        User getUser = context.getBean("getUser", User.class);
        User getUser1 = context.getBean("user", User.class);
        System.out.println(getUser.hashCode());
        System.out.println(getUser1.hashCode());
        System.out.println(getUser.getName());

    }
}
