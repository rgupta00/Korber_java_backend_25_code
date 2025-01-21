package com.empapp.service;

import com.empapp.repo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
    public Employee getById(int id);
}
