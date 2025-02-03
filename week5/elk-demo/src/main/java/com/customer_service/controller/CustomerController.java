package com.customer_service.controller;

import com.customer_service.model.Customer;
import com.customer_service.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

  private final CustomerService customerService;

  //http://localhost:8081/api/v1/customers/all
  @GetMapping("/all")
  public ResponseEntity<List<Customer>> getAllCustomers() {
    log.info("START - getAllCustomers");
    var customers = customerService.listAllCustomers();
    log.info("END - getAllCustomers");

    return ResponseEntity.ok(customers);
  }

//  http://localhost:8081/api/v1/customers?customerId=ad77f11a-dd6b-48f4-a214-f9226b35d5b9
  @GetMapping
  public ResponseEntity<Customer> getCustomerById(@RequestParam("customerId") String id) {
    log.info("START - getCustomerById, id: {}", id);
    var customer = customerService.getCustomerById(id);
    log.info("END - getCustomerById");

    return ResponseEntity.ok(customer);
  }
}
