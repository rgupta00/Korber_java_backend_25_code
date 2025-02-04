package com.productapp.service;

import com.productapp.dto.Product;

public interface ProductService {
    public Product getById(int id, String couponCode);
}
