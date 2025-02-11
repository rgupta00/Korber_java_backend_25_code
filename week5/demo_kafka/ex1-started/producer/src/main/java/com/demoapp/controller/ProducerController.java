package com.demoapp.controller;

import com.demoapp.dto.Product;
import com.demoapp.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

	@Autowired
	private ProduceService produceService;


	@PostMapping("producer/{message}")
	public String callProducer(@PathVariable String message) {
		produceService.produce(message);
		return "mesage send";
	}
}