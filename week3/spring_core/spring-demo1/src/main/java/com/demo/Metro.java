package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "pre-prod")
public class Metro implements Vehicle{
    @Value("tata")
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public void move() {
        System.out.println("moving in a metro :  "+ brand);
    }
}
