package com.app1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {
    @Value("${app.name}")
    private String val;

    @GetMapping(path = "app1")
    public String hello(){
        return "hello app1 : "+val;
    }
}
