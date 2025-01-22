package com.demo;

import com.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //I
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext
                        (AppConfig.class);
        Passanger p=(Passanger) ctx.getBean("p");
        p.travel();




        //Spring framework can automized DI
        //under the hood spring is a di container
        //Push :manual push: dev :(
//        Vehicle vehicle=new Metro();
//        Passanger p=new Passanger();
//        p.setVehicle(vehicle);
//        p.setName("raja");
//        p.travel();
        //hey spring give me object of passager
        //as a programmer i need to teach spring what depend on what
        //Bean wiring: 3 ways 2003
        // 2003: java 4: ie using XML (deprecated): intellij ide dont hv much support for XML
        //2006: Spring 2.5+: annoation
        //2008: Spring 3.0+: java config
        //2013: Spring Boot: ann+ java config

    }
}
