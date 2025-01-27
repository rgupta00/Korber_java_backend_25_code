package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //---------get all products
    @GetMapping(path = "products")
    public List<Product> getAll(){
        return productService.getProducts();
    }
    //----------get by id
    @GetMapping(path = "products/{id}")
    public Product getProductById(@PathVariable(name = "id") int id){
        return productService.getProductById(id);
    }


}
