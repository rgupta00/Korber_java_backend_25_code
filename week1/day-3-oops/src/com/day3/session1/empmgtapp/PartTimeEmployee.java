package com.day3.session1.empmgtapp;

public class PartTimeEmployee extends Employee {
    private int noOfDays;
    private double ratePerDay;

    public PartTimeEmployee(int id, String name, int noOfDays, double ratePerDay) {
        super(id, name);
        this.noOfDays=noOfDays;
        this.ratePerDay=ratePerDay;
    }

    @Override
    public double getPayement() {
        return noOfDays*ratePerDay*.8;
    }
}
