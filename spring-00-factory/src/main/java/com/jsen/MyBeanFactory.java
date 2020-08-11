package com.jsen;


import com.jsen.service.UserService;
import com.jsen.service.UserServiceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyBeanFactory {

    private static Properties properties = new Properties();

    static {
        try {
            //获取 applicationContext.properties 输入流
            InputStream stream = MyBeanFactory.class.getResourceAsStream("/applicationContext.properties");
            //将输入流的数据 加载到 properties
            properties.load(stream);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static UserService getUserService() {
        return new UserServiceImpl();
    }


    public static UserService getUserService02() {
        System.out.println("通过反射的方式 进行进一步的解耦");
        UserService userService = null;
        try {
            Class clazz = Class.forName("com.jsen.service.UserServiceImpl");
            userService = (UserService) clazz.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return userService;
    }

    /**
     * @param bean
     * @return
     */
    public static Object getBean(String bean) {
        System.out.println(bean + "通过反射的方式 + 读取配置文件 进行 终极 的解耦");
        Object object = null;
        try {
            Class clazz = Class.forName(properties.getProperty(bean));
            object = clazz.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return object;
    }

}
