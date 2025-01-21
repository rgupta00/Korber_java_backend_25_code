package com.empapp.repository;

import java.util.List;

//declare crud methods
public interface EmployeeRepo {
    List<Employee> findAll();
    Employee findById(int id);
    public Employee save(Employee employee);
    public void deleteById(int id);
    public void update(int id, Employee employee);
}
