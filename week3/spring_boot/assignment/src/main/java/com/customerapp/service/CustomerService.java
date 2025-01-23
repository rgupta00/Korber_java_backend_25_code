package com.customerapp.service;
import com.customerapp.dao.Customer;

import java.util.List;

public interface CustomerService {
  List<Customer> allCust();
  Customer getCustById(int id);
  Customer addCust(Customer customer);
}
