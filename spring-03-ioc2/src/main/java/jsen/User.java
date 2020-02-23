package jsen;

import javax.crypto.spec.PSource;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
        System.out.println("有参构造器创建对象 - >" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
