package com.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext
                        (MyConfg.class);

//        Engine engine=ctx.getBean("e", Engine.class);
//        System.out.println(engine.hashCode());
//
//        Engine engine2=ctx.getBean("e", Engine.class);
//        System.out.println(engine2.hashCode());

       Car c=ctx.getBean("car", Car.class);
        System.out.println(c.hashCode());
        System.out.println(c.getEngine().hashCode());

        Car c2=ctx.getBean("car", Car.class);
        System.out.println(c2.hashCode());
        System.out.println(c2.getEngine().hashCode());

//        c.run();
//        Car c2=ctx.getBean("car", Car.class);
//        System.out.println(c.hashCode());
//        System.out.println(c2.hashCode());
//        System.out.println(MyConfg.class);
    }
}
