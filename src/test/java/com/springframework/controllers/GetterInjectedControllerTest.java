package com.springframework.controllers;

import com.springframework.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setup() throws Exception{
        this.getterInjectedController =  new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        Assert.assertEquals(GreetingServiceImpl.Hello, getterInjectedController.sayHello());
    }
}
