package com.feign.clientdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "service-greeting")
public interface SchedualServiceGreeting {

    @GetMapping(value = "/greetings/{id}")
    Greeting findOneByGreetingId(@PathVariable("id") Integer id);
}
