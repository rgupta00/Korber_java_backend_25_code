package com.deptapp.controller;

import com.deptapp.dto.Department;
import com.deptapp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    //http://localhost:8083/departments/IT
    @GetMapping("departments/{name}")
    public Department getByName(@PathVariable String name) {

        return departmentService.getByName(name);
    }
}
