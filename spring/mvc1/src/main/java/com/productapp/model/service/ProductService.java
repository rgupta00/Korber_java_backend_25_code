package com.productapp.model.service;

import com.productapp.model.entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public Product addProduct(Product product);

    public void updateProduct(int productId, Product product);
    public void deleteProduct(int productId);
    public Product getProductById(int productId);
}
