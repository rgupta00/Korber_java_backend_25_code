package com.day3.session1.empmgtapp;

public class FullTimeEmployee extends Employee {
    private double salary;
    private String ppf;

    public FullTimeEmployee(int id, String name, double salary, String ppf) {
        super(id, name);
        this.salary = salary;
        this.ppf=ppf;
    }
    @Override
    public double getPayement() {
        return salary*.7;
    }
}
