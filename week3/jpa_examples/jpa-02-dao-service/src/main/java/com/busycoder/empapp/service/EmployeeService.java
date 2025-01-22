package com.busycoder.empapp.service;

import com.busycoder.empapp.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
    public Employee findById(int id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(int id, Employee employee);
    public Employee deleteById(int id);
}
