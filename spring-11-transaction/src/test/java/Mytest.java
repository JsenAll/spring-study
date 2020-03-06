import org.jsen.dao.UserMapper;
import org.jsen.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        List<User> userMapperImpl2 = context.getBean("userMapperImpl3", UserMapper.class).selectUser();
    }

    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        int i = context.getBean("userMapperImpl3", UserMapper.class).addUser(new User(992, "恩泽", "enz"));
    }
}
