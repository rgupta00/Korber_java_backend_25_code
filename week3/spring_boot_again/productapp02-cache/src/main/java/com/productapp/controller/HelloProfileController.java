package com.productapp.controller;

import com.productapp.dto.InfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProfileController {

    @Autowired
    private InfoDto infoDto;

    @Value(("${key.message}"))
    private String message;

    @GetMapping("/helloinfo")
    public InfoDto infoDto() {
        return infoDto;
    }

    @GetMapping("/helloprofile")
    public String hello() {
        return message;
    }
}
