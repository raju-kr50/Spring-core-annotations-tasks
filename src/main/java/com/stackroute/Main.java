package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
    }


}
