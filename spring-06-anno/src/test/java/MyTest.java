import jsen.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void te() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user1.hashCode()+"->"+user.hashCode());
        String name = user.name;
        System.out.println(name);
    }
}
