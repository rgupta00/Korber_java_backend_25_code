package com.demoapp.controller;

import com.demoapp.dto.Product;
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

    @PostMapping("productapp")
    public void sendMessage(@RequestBody  Product product) {
            for(int i=0;i<10000; i++){
                producerService.sendMessage(product);
            }

    }
}
