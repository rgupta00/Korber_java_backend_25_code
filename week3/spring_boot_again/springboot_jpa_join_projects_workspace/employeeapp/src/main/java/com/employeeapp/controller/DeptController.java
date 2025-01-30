package com.employeeapp.controller;

import com.employeeapp.entities.Department;
import com.employeeapp.exceptions.ResouceNotFoundException;
import com.employeeapp.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping(path = "departments")
    public List<Department> getAll(){
        return departmentRepo.findAll();
    }

    @GetMapping(path = "departments/{id}")
    public Department getById(@PathVariable int id){
        return departmentRepo.findById(id).orElseThrow(()->new ResouceNotFoundException("dept is not found"));
    }


}
