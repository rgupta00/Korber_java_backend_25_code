package com.productapp.service;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public List<Product> getAll();
    public Product getById(String id);
    public Product deleteProduct(String id);
    public Product updateProduct(String id, Product product);
    //how to remove cache periodically?
    public void evictAll();
}
