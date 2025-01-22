package com.config;

import com.demo.Bike;
import com.demo.Car;
import com.demo.Passanger;
import com.demo.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration //i will go with ano config
@ComponentScan(basePackages = "com.demo") //find annotated classes in this package
public class AppConfig {

    @Bean(value = "p")
    public Passanger passanger(Vehicle vehicle){
        Passanger passanger=new Passanger();
        passanger.setName("raja");
        passanger.setVehicle(vehicle);
        return  passanger;
    }
    @Bean
    public Vehicle getCar(){
        Car car=new Car();
        car.setBrand("i10");
        return car;
    }
    @Primary
    @Bean
    public Vehicle getBike(){
        Bike bike=new Bike();
        bike.setBrand("honda");
        return bike;
    }
}
