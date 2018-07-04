package com.springframework.controllers;


import com.springframework.services.GreetingServiceImpl;

public class PropertyInjectedConroller {
    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
