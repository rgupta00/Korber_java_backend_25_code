package com.day3.session1.empmgtapp;

abstract public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract public double getPayement();
}
