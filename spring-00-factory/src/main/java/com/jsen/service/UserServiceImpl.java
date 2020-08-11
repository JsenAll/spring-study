package com.jsen.service;

import com.jsen.MyBeanFactory;
import com.jsen.dao.UserDao;
import com.jsen.pojo.User;



public class UserServiceImpl implements UserService {
    private UserDao userDao = (UserDao) MyBeanFactory.getBean("userDao");

    public void register(User user) {
        userDao.save(user);
    }

    public void login(String name, String passWord) {
        userDao.queryUserByNameAndPassword(name, passWord);
    }
}
