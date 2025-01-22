package com.demo;

public class Car implements Vehicle{
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void move(){
        System.out.println("moving in a car :"+ brand);
    }
}
