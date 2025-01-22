package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component(value = "v1")
@Profile("prod")
public class Car implements Vehicle{
    @Value("i10")
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void move(){
        System.out.println("moving in a car :"+ brand);
    }
}
