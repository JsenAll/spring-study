package com.jsen;


import com.jsen.service.UserService;
import com.jsen.service.UserServiceImpl;

public class MyBeanFactory {
    public static UserService getUserService() {
        return new UserServiceImpl();
    }

}
