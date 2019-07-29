package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    private Actor actor;

    @Autowired
    public Movie() {
    }

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Autowired
    public Actor getActor() {
        return actor;
    }

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

}
