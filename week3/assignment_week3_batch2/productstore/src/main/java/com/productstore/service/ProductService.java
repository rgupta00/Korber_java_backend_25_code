package com.productstore.service;

import com.productstore.entities.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    public Product findByName(String name);
    public List<Product> getAllProducts();
    public Product getProductById(int id);
    public Product addProduct(Product product);
    public Product updateProduct( int id, Product product);
    public void deleteProduct(int id);

    public List<Product> getAllProductSorted(String field);
    public Page<Product> getAllProductPage(int offset, int pageSize);
    public Page<Product> getAllProductPageSorted(String field,int offset, int pageSize);
}
