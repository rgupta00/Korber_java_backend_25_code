package com.demo;

import com.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                =new AnnotationConfigApplicationContext(AppConfig.class);

        Magician magician = applicationContext
                .getBean("m",Magician.class);
      String result = magician.doMagic();
        System.out.println(result);




    }
}