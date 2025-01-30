package com.productapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//HTTP
@RestController
public class HelloController {

    //http://localhost:8090/hello/sumit/noida
    @GetMapping("/hello/{name}/{city}")
    public String hello(@PathVariable String name, @PathVariable String city) {
        return "hello "+ name + " "+ city;
    }
    //RequestParam
    //http://localhost:8090/hello1?name=sumit&city=banglore
    @GetMapping("/hello1")
    public String hello1(@RequestParam  String name, @RequestParam String city) {
        return "hello "+ name + " "+ city;
    }
}
