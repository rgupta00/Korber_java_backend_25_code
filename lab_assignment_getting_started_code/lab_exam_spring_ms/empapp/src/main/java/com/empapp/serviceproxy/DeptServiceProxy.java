package com.empapp.serviceproxy;

import com.empapp.dto.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="deptapp",url="http://localhost:8083")
public interface DeptServiceProxy {

    @GetMapping("departments/{name}")
    public Department getByName(@PathVariable String name);
}
