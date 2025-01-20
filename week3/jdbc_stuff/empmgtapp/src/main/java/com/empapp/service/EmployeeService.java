package com.empapp.service;

import com.empapp.repository.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    public Employee save(Employee employee);
    public void deleteById(int id);
    public void update(int id, Employee employee);
}
