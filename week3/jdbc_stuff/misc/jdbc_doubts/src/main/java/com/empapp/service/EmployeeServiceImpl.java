package com.empapp.service;

import com.empapp.exceptions.EmployeeNotFoundException;
import com.empapp.repo.Employee;
import com.empapp.repo.EmployeeRepo;
import com.empapp.repo.impl.EmployeeRepoImpl;

import java.util.List;
//Service layer =BL + non functional requirement
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(){
        employeeRepo=new EmployeeRepoImpl();
    }
    @Override
    public List<Employee> getAll() {
        return employeeRepo.getAll();
    }

    @Override
    public Employee getById(int id) {
        Employee employee=employeeRepo.getById(id);
        if(employee!=null){
            return employee;
        }else
            throw new EmployeeNotFoundException("emp with id "+ id +" is not found");
    }
}
