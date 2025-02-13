package com.deptapp.service;

import com.deptapp.dto.Department;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private Map<String, Department> departmentMap;

    public DepartmentServiceImpl() {
        this.departmentMap=new HashMap<>();
        departmentMap.put("IT", new Department(1,"IT", "BTM"));
        departmentMap.put("SALES", new Department(2,"SALES", "Delhi"));
    }



    @Override
    public Department getByName(String name) {
        return departmentMap.get(name);
    }
}
