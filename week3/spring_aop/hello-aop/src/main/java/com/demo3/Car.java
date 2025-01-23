package com.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Car {

    private Engine engine;

    public Car(){}

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("setter is called");
        this.engine = engine;
    }

    public Car(Engine engine) {
        System.out.println("constructor is called");
        this.engine = engine;
    }

    public void run(){
        engine.start();
        System.out.println("car is running");
    }
}
