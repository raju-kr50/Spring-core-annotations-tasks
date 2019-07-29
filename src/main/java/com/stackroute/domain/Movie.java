package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor actor;

//    @Autowired
    public Movie() {
    }

//    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

//    @Autowired
    public Actor getActor() {
        return actor;
    }

//    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory method");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName method " +s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext method");
    }
}
