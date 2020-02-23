package jsen.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Persion {
    @Autowired
    private Dog dog;
    @Autowired
    @Qualifier(value = "catred")
    private Cat cat;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        dog.shuot();
        cat.shuot();
        return "Persion{" +
                "name" + name +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
