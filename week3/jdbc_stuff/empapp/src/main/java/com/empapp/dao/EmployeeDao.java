package com.empapp.dao;

import com.empapp.exceptions.DaoException;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    public List<Employee> allEmp();
    public Employee getEmpById(int id);
    public Employee addEmp(Employee employee);
    public void updateEmp(int id, Employee employee);
    public void deleteEmp(int id);
}
