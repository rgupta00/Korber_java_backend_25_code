package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestController {

    private final ProductService productService;
    //get all
    @GetMapping(path = "products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productService.getAll());
    }




    //get by id
    @GetMapping(path = "products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product getById(@PathVariable int id){
        return productService.getById(id);
    }

    //update
    @PutMapping(path = "products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product updateProduct(@PathVariable int id, @RequestBody  Product product){
        return productService.updateProduct(id, product);
    }
    //delete
    @DeleteMapping(path = "products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
         productService.deleteProduct(id);
        return new ResponseEntity<String>("product deleted successfully!.", HttpStatus.OK);
    }
    //add
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "products")
    public Product addProduct( @RequestBody  Product product){
         productService.addProduct(product);
         return product;
    }
}
