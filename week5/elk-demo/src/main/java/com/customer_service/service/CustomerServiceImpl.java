package com.customer_service.service;

import com.customer_service.model.Customer;
import com.customer_service.repo.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
  private final CustomerRepository customerRepository;

  @Override
  public List<Customer> listAllCustomers() {
    log.info("START - listAllCustomers");

    var customers = customerRepository.findAll();

    log.info("END - listAllCustomers");

    return customers;
  }

  @Override
  public Customer getCustomerById(String id) {
    // Check if customer exists or not
    log.info("START - getCustomerById, id: {}", id);

    var customer = customerRepository.findById(id).orElseThrow(() -> {
      log.error("Customer not found, id: {}", id);
      return new RuntimeException("Customer not found");
    });

    log.info("END - getCustomerById");
    return customer;
  }
}
