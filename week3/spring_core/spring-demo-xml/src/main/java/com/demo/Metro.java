package com.demo;

public class Metro implements Vehicle{
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public void move() {
        System.out.println("moving in a metro :  "+ brand);
    }
}
