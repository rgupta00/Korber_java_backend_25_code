//package com.productappclient.controller;
//
//import com.productappclient.dto.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//@RestController
//public class ProductAppClientController {
//    private RestTemplate restTemplate;
//
//    @Autowired
//    public ProductAppClientController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//    //i want to call a endpoint
//    @GetMapping(path = "productclient/{id}")
//    public Product getPoductById(@PathVariable int id){
////        return restTemplate
////                .getForObject("http://localhost:8090/products/1",Product.class);
//        ResponseEntity<Product> productResponseEntity=restTemplate.getForEntity
//                ("http://localhost:8090/products/"+id,Product.class);
//        System.out.println(productResponseEntity.getStatusCode());
//
//        return productResponseEntity.getBody();
//    }
//}
