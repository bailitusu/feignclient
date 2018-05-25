package com.feign.clientdemo;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-greeting")
public interface SchedualServiceGreeting {

}
