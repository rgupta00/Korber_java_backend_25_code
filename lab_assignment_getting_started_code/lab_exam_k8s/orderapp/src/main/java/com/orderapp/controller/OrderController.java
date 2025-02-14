package com.orderapp.controller;

import com.orderapp.service.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private InstanceInformationService instanceInformationService;

    @GetMapping(path = "orders")
    public String orderDetails(){
        return "orderapp v1: "+ instanceInformationService.retrieveInstanceInfo();
    }

}
