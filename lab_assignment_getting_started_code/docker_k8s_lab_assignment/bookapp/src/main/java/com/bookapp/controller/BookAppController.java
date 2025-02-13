package com.bookapp.controller;

import com.bookapp.service.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAppController {
    private InstanceInformationService instanceInformationService;

    @Autowired
    public BookAppController(InstanceInformationService instanceInformationService) {
        this.instanceInformationService = instanceInformationService;
    }
    @GetMapping(path = "books")
    public String hello(){
        return "books v1: "+ instanceInformationService.retrieveInstanceInfo();
    }
}
