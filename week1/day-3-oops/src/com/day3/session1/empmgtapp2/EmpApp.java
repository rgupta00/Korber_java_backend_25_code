package com.day3.session1.empmgtapp2;

public class EmpApp {
    public static void main(String[] args) {
        Employee employee=new FullTimeEmployee(1,"Raj",100000,"ppf");
        Employee employee2=new PartTimeEmployee(2,"Ekta",10,1000);

        PayementProcessing.processPayment(employee);
        PayementProcessing.processPayment(employee2);

        Freelancer freelancer=new Freelancer(3,"abc",100000);;
        PayementProcessing.processPayment(freelancer);
    }
}
