import jsen.pojo.Persion;
import jsen.res.UserR;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void byName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Persion user = context.getBean("persion", Persion.class);
        System.out.println(user.toString());
    }

    /**
     * 使用注解 自动注入
     */
    @Test
    public void annotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
        Persion user = context.getBean("persion", Persion.class);
        System.out.println(user.getCat().getName());
    }

    /**
     * 使用 最基本的xml 配置文件  可以使用 java 自带的注解
     */

    @Test
    public void re() {
        ApplicationContext context = new ClassPathXmlApplicationContext("rbeans.xml");
        UserR user = context.getBean("userR", UserR.class);
        System.out.println(user.toString());
    }

    public static void main(String[] args) {
        System.out.println("季后赛");
    }


}
