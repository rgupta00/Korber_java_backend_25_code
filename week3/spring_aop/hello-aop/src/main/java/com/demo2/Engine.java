package com.demo2;

import org.springframework.stereotype.Component;


@Component(value = "e")
public class Engine {
    public void start(){
        System.out.println("engine is started...");
    }
}
