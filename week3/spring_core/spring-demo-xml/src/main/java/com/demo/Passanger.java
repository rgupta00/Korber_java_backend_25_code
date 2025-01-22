package com.demo;
//Passanger is a high level module
//Vehicle is a low level module
//OCP
//Passanger is reposible for obtaining vehicle => pull
public class Passanger {
    private String name;
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
