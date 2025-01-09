package com.day3.session1.empmgtapp;

public class EmpApp {
    public static void main(String[] args) {
        Employee employee=new FullTimeEmployee(1,"Raj",100000,"ppf");
        Employee employee2=new PartTimeEmployee(2,"Ekta",10,1000);

        PayementProcessing.processPayment(employee);
        PayementProcessing.processPayment(employee2);

    }
}
