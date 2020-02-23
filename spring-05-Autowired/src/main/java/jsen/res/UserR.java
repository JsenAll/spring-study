package jsen.res;


import javax.annotation.Resource;

public class UserR {
    @Resource
    private Dog dog;
    @Resource(name = "cat2")
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
