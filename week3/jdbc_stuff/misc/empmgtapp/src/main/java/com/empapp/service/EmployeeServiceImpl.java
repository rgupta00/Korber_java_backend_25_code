package com.empapp.service;

import com.empapp.exceptions.EmployeeNotFoundException;
import com.empapp.repository.Employee;
import com.empapp.repository.EmployeeRepo;
import com.empapp.repository.impl.EmployeeRepoJdbcImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo=
            new EmployeeRepoJdbcImpl();

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findById(int id) {
        Employee employee=employeeRepo.findById(id);
        if (employee!=null){
            return employee;
        }else
            throw new EmployeeNotFoundException(" emp with id "+ id +" is not found");
    }

    @Override
    public Employee save(Employee employee) {
        //validation logic here
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public void update(int id, Employee employee) {
        employeeRepo.update(id, employee);
    }
}
