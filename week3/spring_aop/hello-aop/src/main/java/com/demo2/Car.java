package com.demo2;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void run(){
        engine.start();
        System.out.println("car is running");
    }
}
