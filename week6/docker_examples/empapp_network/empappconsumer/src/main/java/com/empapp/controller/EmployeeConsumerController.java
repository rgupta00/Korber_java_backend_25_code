package com.empapp.controller;

import com.empapp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(path = "employee-consumer")
	public String getEmployee() {
		Employee employee=
				restTemplate.getForObject("http://producer:8080/employee", Employee.class);
		return employee.toString();
	}
}
