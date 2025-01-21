package com.empapp.controller;

import com.empapp.repo.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       //Controller REST
        EmployeeService employeeService=new EmployeeServiceImpl();
        List<Employee> employees=employeeService.getAll(); //List<Employee>
        employees.forEach(System.out::println);

        
    }
}