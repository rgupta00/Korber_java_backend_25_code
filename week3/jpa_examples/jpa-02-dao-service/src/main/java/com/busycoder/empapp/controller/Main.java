package com.busycoder.empapp.controller;

import com.busycoder.empapp.entities.Employee;
import com.busycoder.empapp.service.EmployeeService;
import com.busycoder.empapp.service.EmployeeServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();
        Employee employee=new Employee("raj",4500,"IT");
       //employeeService.addEmployee(employee);

        List<Employee> employeeList=employeeService.getAll();
        employeeList.forEach(e-> System.out.println(e));
    }
}
