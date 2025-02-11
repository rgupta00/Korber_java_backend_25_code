package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api")
public class ProductRestController {

    private final ProductService productService;
    private final Environment environment;
    //get all
    @GetMapping(path = "products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productService.getAll());
    }
    //get by id
    @GetMapping(path = "products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product getById(@PathVariable String id){
        return productService.getById(id);
    }

    //update
    @PutMapping(path = "products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product updateProduct(@PathVariable String id, @RequestBody  Product product){
        return productService.updateProduct(id, product);
    }
    //delete
    @DeleteMapping(path = "products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id){
         productService.deleteProduct(id);
         return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    //add
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "products")
    public String addProduct( @RequestBody  Product product){
         productService.addProduct(product);
         return environment.getProperty("app.added_successfully");
    }
}
