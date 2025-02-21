package com.employee.controllers;

import com.employee.services.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    private InstanceInformationService instanceInformationService;

    @Autowired
    public EmpController(InstanceInformationService instanceInformationService) {
        this.instanceInformationService = instanceInformationService;
    }
    @GetMapping(path = "emps")
    public String hello(){
        return "emp v4: "+ instanceInformationService.retrieveInstanceInfo();
    }
}
