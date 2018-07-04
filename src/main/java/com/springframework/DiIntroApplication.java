package com.springframework;

import com.springframework.controllers.GetterInjectedController;
import com.springframework.controllers.PropertyInjectedConroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiIntroApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiIntroApplication.class, args);


        System.out.println(ctx.getBean(PropertyInjectedConroller.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());

    }
}
