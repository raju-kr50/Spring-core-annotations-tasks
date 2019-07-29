package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setAge(42);
        actor.setName("Shahrukh");
        actor.setGender("Male");
        return actor;
    }

    @Bean
    @Scope("prototype")
    public Movie movie() {
        Movie movie = new Movie();
        movie.setActor(actor());
        return movie;
    }

}
