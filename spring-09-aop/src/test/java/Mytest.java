import com.jsen.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //返回的是接口 被代理的 是实现此接口的 实现类  接口相当于 一定具有某种属性的 标准 实现我 就要有我的属性
        UserService user = context.getBean("userService", UserService.class);
        user.add();
    }
    @Test
    public void  text1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDiy.xml");
        //返回的是接口 被代理的 是实现此接口的 实现类  接口相当于 一定具有某种属性的 标准 实现我 就要有我的属性
        UserService user = context.getBean("userService", UserService.class);
        user.add();
    }
    @Test
    public void  text2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnoo.xml");
        //返回的是接口 被代理的 是实现此接口的 实现类  接口相当于 一定具有某种属性的 标准 实现我 就要有我的属性
        UserService user = context.getBean("userService", UserService.class);
        user.add();
    }

}
