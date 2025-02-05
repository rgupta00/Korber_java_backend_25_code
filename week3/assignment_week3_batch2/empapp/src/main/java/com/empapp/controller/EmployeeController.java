package com.empapp.controller;

import com.empapp.repo.Employee;
import com.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    //get all employees
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }
    //get employee by id
    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }
    //add employee


    //update employee

    //delete employee
}
