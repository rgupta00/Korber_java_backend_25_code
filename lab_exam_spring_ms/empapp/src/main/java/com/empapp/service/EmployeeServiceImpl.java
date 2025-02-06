package com.empapp.service;

import com.empapp.dto.Department;
import com.empapp.dto.EmpDeptDto;
import com.empapp.dto.Employee;
import com.empapp.serviceproxy.DeptServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private Map<String, Employee> employeeMap;

    @Autowired
    private DeptServiceProxy deptServiceProxy;

    public EmployeeServiceImpl(){
        employeeMap = new HashMap<>();
        employeeMap.put("Raj", new Employee(1, "Raj", 10000, "IT"));
        employeeMap.put("Ravi", new Employee(2, "Ravi", 20000, "SALES"));
    }
    @Override
    public EmpDeptDto getByName(String name) {
        EmpDeptDto empDeptDto = new EmpDeptDto();
        empDeptDto.setEmployee(employeeMap.get(name));
        Department department=deptServiceProxy.getByName(employeeMap.get(name).getDeptName());
        empDeptDto.setDepartment(department);
        return empDeptDto;

    }
}
