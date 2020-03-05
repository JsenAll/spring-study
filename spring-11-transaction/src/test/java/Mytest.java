import org.jsen.dao.UserMapper;
import org.jsen.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        List<User> userMapperImpl2 = context.getBean("userMapperImpl2", UserMapper.class).selectUser();
    }
}
