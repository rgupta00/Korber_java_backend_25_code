package com.app2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {
    @Value("${app.name}")
    private String val;

    @GetMapping(path="app2")
    public String hello(){
        return "app2 hello: "+ val;
    }
}
