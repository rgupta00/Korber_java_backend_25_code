package com.productapp.model.dao;

import com.productapp.model.entities.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getAll();
    public Product addProduct(Product product);
    public void updateProduct(int productId, Product product);
    public void deleteProduct(int productId);
    public Product getProductById(int productId);
}
