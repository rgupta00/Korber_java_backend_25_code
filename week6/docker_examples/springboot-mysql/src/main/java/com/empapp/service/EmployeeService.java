package com.empapp.service;

import com.empapp.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee>getAll();
    public void addEmployee(Employee employee);
}
