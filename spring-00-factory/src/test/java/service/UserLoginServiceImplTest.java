package service;


import com.jsen.MyBeanFactory;
import com.jsen.dao.UserDao;
import com.jsen.dao.UserDaoImpl;
import com.jsen.pojo.User;
import com.jsen.service.UserService;
import com.jsen.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

    @Test
    public void test05() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        UserService userService = applicationContext.getBean("userService", UserService.class);//省略 强转
        System.out.println("使用spring框架 进行解耦");
        userService.login("蒋厚森", "123");
        userService.register(new User("韩钰", "456"));
    }

    /**
     * Spring 工厂的相关方法
     */
    @Test
    public void test06() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("-->获取所有在配置文件中所有 bean 标签的 ID 值");
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        System.out.println("-->必须在配置文件 applicationContext.xml 中是唯一 不能有两个 id 不一样 class 是一样的");
        UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
        System.out.println(bean);

        System.out.println("-->根据 类型 获取Spring 配置文件中的 应的 id 值");
        String[] names = applicationContext.getBeanNamesForType(UserDaoImpl.class);
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--》判断 Spring 配置文件 是否存在 id 为  **  的 bean");
        System.out.println("是否存在：id为 userDao ："+applicationContext.containsBean("userDao"));

    }

}