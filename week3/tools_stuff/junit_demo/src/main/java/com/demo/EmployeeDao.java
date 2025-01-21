package com.demo;

import jdk.jfr.Percentage;

import java.util.List;

public class EmployeeDao {

    public void add(){
        System.out.println("adding the emp---- [test phase] ");
    }
    public List<Employee> getAll(){
        System.out.println("getting all emp ---[prod phase]");
        return null;
    }
    public void update(int id, Employee employee){
        System.out.println("update");
    }
    public void delete(int id){
        System.out.println("emp is deleted");
    }
}
