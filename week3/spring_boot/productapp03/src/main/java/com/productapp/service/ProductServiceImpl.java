package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.entites.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product findByName(String name){
        Product product= productRepo.findByName(name);
        if(product==null){
            throw new ProductNotFoundException("Product with name "+name+" not found");
        }
        return product;
    }
    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(int id) {
         return productRepo.findById(id)
                 .orElseThrow(()-> new ProductNotFoundException("Product with id "+id+" not found"));
    }

    @Override
    public Product addProduct(Product product) {
         productRepo.save(product);
         return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate=getProductById(id);
        productToUpdate.setPrice(product.getPrice());
        productRepo.save(productToUpdate);
        return productToUpdate;
    }

    @Override
    public Product removeProduct(int id) {
        Product productToRemove=getProductById(id);
        productRepo.delete(productToRemove);
        return productToRemove;
    }
}
