package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //I
        AbstractApplicationContext ctx=
                new ClassPathXmlApplicationContext("demo.xml");
        ctx.registerShutdownHook();
       Foo foo= (Foo) ctx.getBean("foo");
       foo.print();



    }
}
