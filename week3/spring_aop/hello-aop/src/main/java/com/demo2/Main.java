package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext
                        (MyConfg.class);

        Car c=ctx.getBean("car",Car.class);
        c.run();
    }
}
