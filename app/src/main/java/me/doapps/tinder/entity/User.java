package me.doapps.tinder.entity;

/**
 * Created by jonathannolasco on 12/3/16.
 */

public class User {
    private String name;
    private String lastName;
    private String age;

    public User(){}

    public User(String name, String lastName, String age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
