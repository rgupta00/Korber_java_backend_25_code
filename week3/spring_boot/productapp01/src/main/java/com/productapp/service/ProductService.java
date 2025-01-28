package com.productapp.service;

import com.productapp.repo.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProducts();
    Product getProductById(int id);
    public Product addProduct(Product product);
    public Product updateProduct(int id, Product product);
    public Product removeProduct(int id);
}
