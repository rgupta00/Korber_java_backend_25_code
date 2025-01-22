package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component(value = "v2")
@Profile("dev")
public class Bike implements Vehicle {
    @Value("honda")
    private String brand;
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void move(){
        System.out.println("moving on a bike: "+ brand);
    }
}
