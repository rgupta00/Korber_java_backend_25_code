package com.productapp.repo;

import java.util.List;

public interface ProductRepo {
    public List<Product> getProducts();
    public Product getById(int id);
}
