package com.empapp.empapp.controller;

import com.empapp.empapp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping(path = "employee")
    public Employee getEmployee() {
        return new Employee(121, "raj", 4000);
    }
}
