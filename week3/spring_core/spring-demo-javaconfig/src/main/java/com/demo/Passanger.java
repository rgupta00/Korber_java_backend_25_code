package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Passanger is a high level module
//Vehicle is a low level module
//OCP
//Passanger is reposible for obtaining vehicle => pull
/*
    autowire="byType">

    </bean>
 */
@Component(value = "p") //<bean id="p" class="com.demo.Passanger"
public class Passanger {
    @Value("john")  //<property name="name" value="John"/>
    private String name;

    @Autowired
    private Vehicle vehicle;

    public void setName(String name) {
        this.name = name;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void travel(){
        System.out.println("name :"+ name);
        vehicle.move();
    }

}
