package com.productapp.service;

import com.productapp.repo.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProducts();
    Product getProductById(int id);
}
