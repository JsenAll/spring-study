package service;

import dao.UserDao;


public class UserServiceImpl implements UserService {
    UserDao userdao;

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    public void getUser() {
        userdao.getUser();
    }
}
