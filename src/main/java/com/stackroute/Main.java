package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
//import com.stackroute.domain.BeanPostProcessorBean;
import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //***********************************************Task1**********************************************************
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Movie movie = context.getBean("movie", Movie.class);
//        Movie movie1 = context.getBean("movie", Movie.class);
        System.out.println(movie.getActor());
//        System.out.println(movie==movie1);

    //**************************************************Task2***********************************************************
        Actor actor = context.getBean("actor", Actor.class);
        System.out.println(actor);

        ConfigurableApplicationContext context1= new AnnotationConfigApplicationContext(BeanLifecycleDemoBean.class);
        BeanLifecycleDemoBean beanLifecycleDemoBean = context1.getBean("beanLifecycleDemoBean", BeanLifecycleDemoBean.class);
//        System.out.println(beanLifecycleDemoBean);
        context1.close();

//        BeanPostProcessorBean beanPostProcessorBean = context.getBean("beanPostProcessorBean", BeanPostProcessorBean.class);
//        System.out.println(beanPostProcessorBean);
    }


}
