package com.empapp.controller;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeService;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "employees")
    public List<Employee> getAll(){
        return  employeeService.getAll();
    }

    @PostMapping(path = "employees")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return  "emp is saved with id "+ employee.getId();
    }
}
