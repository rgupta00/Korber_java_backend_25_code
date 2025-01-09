package com.day3.session1.empmgtapp2;

abstract public class Employee implements Payable {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
