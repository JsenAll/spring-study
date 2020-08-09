package com.jsen.dao;


import com.jsen.pojo.User;

public class UserDaoImpl implements UserDao {

    public void save(User user) {
        System.out.println("insert into user =" + user);
    }

    public void queryUserByNameAndPassword(String name, String password) {
        System.out.println("query User name = " + name + " password =" + password);
    }
}
