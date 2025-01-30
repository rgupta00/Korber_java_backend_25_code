package com.productappclient.controller;

import com.productappclient.dto.Product;
import com.productappclient.productproxyservice.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductAppClientControllerOpenFeign {

    private ProductServiceProxy productServiceProxy;

    @Autowired
    public ProductAppClientControllerOpenFeign(ProductServiceProxy productServiceProxy) {
        this.productServiceProxy = productServiceProxy;
    }
    @GetMapping(path = "productclient")
    public ResponseEntity<List<Product>>getAllProducts(){
        ResponseEntity<List<Product>> productsResponseEntity = productServiceProxy.getProducts();
        System.out.println(productsResponseEntity.getStatusCode());
        return productsResponseEntity;
    }
    //can u do all other crud operations?
}
