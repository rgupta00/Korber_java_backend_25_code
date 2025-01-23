package com.customerapp.service;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.dao.CustomerDaoJdbcImpl;
import com.customerapp.exception.CustomerNotFoundException;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao=new CustomerDaoJdbcImpl();

    @Override
    public List<Customer> allCust() {
        return customerDao.allCust();
    }

    @Override
    public Customer getCustById(int id) {
        if(customerDao.getCustById(id)!=null)
            return customerDao.getCustById(id);
        else
            throw new CustomerNotFoundException("customer is not found");

    }

    @Override
    public Customer addCust(Customer customer) {
        return customerDao.addCust(customer);
    }
}
