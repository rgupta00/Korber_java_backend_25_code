package com.empapp.web;

import com.empapp.repository.Employee;
import com.empapp.repository.impl.EmployeeRepoJdbcImpl;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------all records---------");
        EmployeeService employeeService = new EmployeeServiceImpl();
        List<Employee> employees = employeeService.findAll();
        employees.forEach(System.out::println);

        System.out.println("-------------find by id---------");
        Employee employee = employeeService.findById(6);

        employee.setSalary(employee.getSalary()+10000);
        System.out.println("-------------update by id---------");
        employeeService.update(6, employee);



    }
}
