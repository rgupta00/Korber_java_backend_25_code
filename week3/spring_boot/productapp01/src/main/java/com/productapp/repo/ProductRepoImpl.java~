package com.productapp.repo;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepoImpl implements ProductRepo{
    private static  Map<Integer, Product> productMap=new HashMap<>() ;
    private static int counter;
    static{
        productMap.put(1, new Product(1, "Laptop", new BigDecimal("10000")));
        productMap.put(2, new Product(2, "Mobile", new BigDecimal("6000")));
        counter=2;
    }

    @Override
    public List<Product> getProducts() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product getById(int id) {
        return productMap.get(id);
    }

    @Override
    public Product addProduct(Product product) {
        product.setId(++counter);
        productMap.put(product.getId(), product);
        return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate = getById(id);
        productToUpdate.setPrice(product.getPrice());
        productMap.put(id, productToUpdate);

        return productToUpdate;
    }

    @Override
    public Product removeProduct(int id) {
        Product productToRemove=getById(id);
        productMap.remove(id);
        return productToRemove;
    }
}
