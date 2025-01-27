package com.productapp.repo;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepoImpl implements ProductRepo{
    private Map<Integer, Product> productMap=new HashMap<>() ;
    public ProductRepoImpl(){
        productMap.put(1, new Product(1, "Laptop", new BigDecimal("10000")));
        productMap.put(2, new Product(2, "Mobile", new BigDecimal("6000")));

    }

    @Override
    public List<Product> getProducts() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product getById(int id) {
        return productMap.get(id);
    }
}
