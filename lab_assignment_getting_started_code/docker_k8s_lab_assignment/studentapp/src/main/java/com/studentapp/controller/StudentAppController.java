package com.studentapp.controller;

import com.studentapp.service.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAppController {

    private InstanceInformationService instanceInformationService;
    @Autowired
    public StudentAppController(InstanceInformationService instanceInformationService) {
        this.instanceInformationService = instanceInformationService;
    }
    @GetMapping(path = "students")
    public String hello(){
        return "students v1: "+ instanceInformationService.retrieveInstanceInfo();
    }
}

