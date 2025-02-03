package com.productapp.service;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public Product getById(int id);
    public void deleteProduct(int id);
    public Product addProduct(Product product);
    public Product updateProduct(int id, Product product);

}
