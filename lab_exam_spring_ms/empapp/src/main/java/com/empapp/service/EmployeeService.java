package com.empapp.service;

import com.empapp.dto.EmpDeptDto;
import com.empapp.dto.Employee;

public interface EmployeeService {
    public EmpDeptDto getByName(String name);
}
