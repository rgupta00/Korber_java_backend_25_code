package com.productapp.controller;

import com.productapp.services.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private InstanceInformationService instanceInformationService;

    @GetMapping(path = "hello-world")
    public String hello(){
        return instanceInformationService.retrieveInstanceInfo()+": "+ "productapp "+ "v3";
    }
}
