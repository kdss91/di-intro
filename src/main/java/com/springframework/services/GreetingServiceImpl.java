package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String Hello = "Hello Spring!!! - Original";

    @Override
    public String sayGreeting() {
        return Hello;
    }
}
