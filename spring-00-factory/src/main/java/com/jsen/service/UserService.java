package com.jsen.service;

import com.jsen.pojo.User;

public interface UserService {

    public void register(User user);

    public void login(String name,String passWord);
}
