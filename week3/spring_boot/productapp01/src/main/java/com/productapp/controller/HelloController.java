package com.productapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //PathVariable vs RequestParam vs RestController

    //PathVariable
    @GetMapping("demo/{name}/{city}")
    public String getPathVariable(@PathVariable String name, @PathVariable String city) {
        return "Hello " + name + " from " + city;
    }

    //RequestParam: pagantion
        //http://localhost:8081/demo1?name=John&city=New York
    @GetMapping("demo1")
    public String getRequestParam(@RequestParam String name, @RequestParam String city) {
        return "Hello " + name + " from " + city;
    }
}
