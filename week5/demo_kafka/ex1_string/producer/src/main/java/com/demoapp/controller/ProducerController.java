package com.demoapp.controller;

import com.demoapp.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

    private ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("hello/{message}")
    public void sendMessage(@PathVariable String message) {
        for(int i=0;i<1000;i++) {
            producerService.sendMessage(message + " " + i);
        }
    }
}
