package com.empapp.service;

import com.empapp.dao.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    public List<Employee> allEmp() ;
    public Employee getEmpById(int id);
    public Employee addEmp(Employee employee);
    public void updateEmp(int id, Employee employee);
    public void deleteEmp(int id);
}
