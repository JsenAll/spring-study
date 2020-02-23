import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        Object user = applicationContext.getBean("user2");
        System.out.println(user);
        Object user2 = applicationContext.getBean("user");
        System.out.println(user2);
        Object user3 = applicationContext.getBean("sb");
        System.out.println(user3);

    }
}
