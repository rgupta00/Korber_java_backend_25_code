package com.demo;

public class Bike implements Vehicle {
    private String brand;
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void move(){
        System.out.println("moving on a bike: "+ brand);
    }
}
