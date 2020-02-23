package jsen;

import jsen.pojo.Student;
import jsen.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void textp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.toString());
    }

    @Test
    public void textc() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = applicationContext.getBean("user2", User.class);
        User user2 = applicationContext.getBean("user2", User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
    }
}
