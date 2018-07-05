package com.springframework;

import com.springframework.controllers.GetterInjectedController;
import com.springframework.controllers.MyController;
import com.springframework.controllers.PropertyInjectedConroller;
import com.springframework.controllers.ConstructorInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiIntroApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiIntroApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedConroller.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }
}
