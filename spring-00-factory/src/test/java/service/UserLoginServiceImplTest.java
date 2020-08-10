package service;


import com.jsen.MyBeanFactory;
import com.jsen.pojo.User;
import com.jsen.service.UserService;
import com.jsen.service.UserServiceImpl;
import org.junit.Test;

public class UserLoginServiceImplTest {
    /**
     * 正常创建对象 耦合性 太强
     */

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


    @Test
    public void test03() {
        UserService userService = MyBeanFactory.getUserService02();
        System.out.println("使用工厂模式==反射");
        userService.login("蒋厚森", "123");
        userService.register(new User("韩钰", "456"));
    }


    @Test
    public void test04() {
        UserService userService = (UserService) MyBeanFactory.getBean("userService");
        System.out.println("使用简单工厂模式==反射++读取配置文件");
        userService.login("蒋厚森", "123");
        userService.register(new User("韩钰", "456"));
    }
}