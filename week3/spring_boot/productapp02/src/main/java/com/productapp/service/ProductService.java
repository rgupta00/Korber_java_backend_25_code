package com.productapp.service;

import com.productapp.entites.Product;

import java.util.List;

public interface ProductService {
    public Product findByName(String name);
    public List<Product> getProducts();
    Product getProductById(int id);
    public Product addProduct(Product product);
    public Product updateProduct(int id, Product product);
    public Product removeProduct(int id);
}
