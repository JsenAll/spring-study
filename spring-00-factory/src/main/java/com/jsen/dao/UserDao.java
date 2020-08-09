package com.jsen.dao;


import com.jsen.pojo.User;

public interface UserDao {

    void save(User user);

    void queryUserByNameAndPassword(String name, String passWord);
}
