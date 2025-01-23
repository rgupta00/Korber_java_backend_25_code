package com.demo2;

public class Main {
    public static void main(String[] args) {
        Engine engine=new Engine();
        Car car = new Car(engine);
        car.run();
    }
}
