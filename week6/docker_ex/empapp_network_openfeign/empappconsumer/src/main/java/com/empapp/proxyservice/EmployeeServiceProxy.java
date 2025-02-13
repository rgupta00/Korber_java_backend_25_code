package com.empapp.proxyservice;

import com.empapp.entities.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="feignclient", url = "http://producer:8080")
public interface EmployeeServiceProxy {
    @GetMapping(path = "employee")
    public Employee getEmployee();
}
