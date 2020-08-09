package service;


import com.jsen.MyBeanFactory;
import com.jsen.pojo.User;
import com.jsen.service.UserService;
import com.jsen.service.UserServiceImpl;
import org.junit.Test;

public class UserLoginServiceImplTest {
    @Test
    public void test01() {
        UserService userService = new UserServiceImpl();
        userService.login("蒋厚森", "123");
        userService.register(new User("韩钰", "456"));
    }

    /**
     * 简单工厂
     */
    @Test
    public void test02() {
        UserService userService = MyBeanFactory.getUserService();
        System.out.println("使用简单工厂模式");
        userService.login("蒋厚森", "123");
        userService.register(new User("韩钰", "456"));
    }
}