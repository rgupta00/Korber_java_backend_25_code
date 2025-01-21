package com.empapp.repo;

import java.util.List;

public interface EmployeeRepo {
    public List<Employee> getAll();
    public Employee getById(int id);
}
