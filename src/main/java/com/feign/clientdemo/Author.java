package com.feign.clientdemo;

import java.util.HashSet;
import java.util.Set;

public class Author {
    private Integer id;

    private String name;

    private Set<Greeting> greetings = new HashSet<>();

    public Author() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Greeting> getGreetings() {
        return greetings;
    }

    public void setGreetings(Set<Greeting> greetings) {
        this.greetings = greetings;
    }
}
