import dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用Spring 来优化 代码  向使用什么数据库直接修改配置文件即可 代码不需要改动
 */
public class UseSpringMyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDaoMqlImpl = (UserDao) applicationContext.getBean("userDaoOracleImpl");
        userDaoMqlImpl.getUser();
        System.out.println();
    }
}
