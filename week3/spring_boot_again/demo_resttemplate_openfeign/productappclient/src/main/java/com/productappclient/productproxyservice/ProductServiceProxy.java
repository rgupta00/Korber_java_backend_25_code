package com.productappclient.productproxyservice;

import com.productappclient.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "product-service", url = "http://localhost:8090")
public interface ProductServiceProxy {
    @GetMapping(path = "products")
    public ResponseEntity<List<Product>> getProducts();

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id);

    @PostMapping("products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) ;

    @PutMapping("products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id,
                                                 @RequestBody Product product);

    @DeleteMapping("products/{id}")
    public ResponseEntity<Void> removeProduct(@PathVariable int id);
}
