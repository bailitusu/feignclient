package com.feign.clientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    SchedualServiceGreeting schedualServiceGreeting;

    @GetMapping(value = "/greetings/{id}")
    public Greeting getGreeting(@PathVariable("id") Integer id) {
        return schedualServiceGreeting.findOneByGreetingId(id);
    }
}
