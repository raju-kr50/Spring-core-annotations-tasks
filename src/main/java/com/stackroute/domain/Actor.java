package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    private String name;
    private String gender;
    private int age;

//    @Autowired
    public Actor() {
    }

//    @Autowired
    public String getName() {
        return name;
    }

//    @Autowired
    public void setName(String name) {
        this.name = name;
    }

//    @Autowired
    public String getGender() {
        return gender;
    }

//    @Autowired
    public void setGender(String gender) {
        this.gender = gender;
    }

//    @Autowired
    public int getAge() {
        return age;
    }

//    @Autowired
    public void setAge(int age) {
        this.age = age;
    }

//    @Autowired
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}
