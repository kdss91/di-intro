package com.springframework.controllers;

import com.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedConroller propertyInjectedConroller;

    @Before
    public void setup() throws Exception{
        this.propertyInjectedConroller = new PropertyInjectedConroller();
        this.propertyInjectedConroller.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void TestGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.Hello, propertyInjectedConroller.sayHello());
    }
}
