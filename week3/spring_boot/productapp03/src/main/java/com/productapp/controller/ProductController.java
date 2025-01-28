package com.productapp.controller;

import com.productapp.entites.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@Controller+ @ResponseBody(trigger the parser to return json)
@RequestMapping(path = "api")
public class ProductController {

    private ProductService productService;

    //@Autowired is optional to write on single ctr
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());
    }

    @GetMapping(path = "products/name/{name}")
    public ResponseEntity<Product> findByName(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findByName(name));
    }

    //get by id
    @GetMapping(path = "products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body( productService.getProductById(id));
    }

    @PostMapping(path = "products")
    public ResponseEntity<Product> addProduct( @RequestBody @Valid Product product){
        Product productToReturn = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productToReturn);
    }

    //Exception hainding in controller layer.. 100 of controller, try catch... AOP
    //Ex hainding is a ccc, using aop
    //update
    @PutMapping(path = "products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product){
        return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id, product));
    }

    //delete
    @DeleteMapping(path = "products/{id}")
    public ResponseEntity<Void> removeProduct(@PathVariable int id){
        productService.removeProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
