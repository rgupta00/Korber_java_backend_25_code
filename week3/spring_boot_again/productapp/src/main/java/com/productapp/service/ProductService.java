package com.productapp.service;

import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;

import java.util.List;

public interface ProductService {
    public List<ProductDto> getProducts();
    ProductDto getProductById(int id);

    public ProductDto addProduct(ProductDto productDto);
    public ProductDto updateProduct(int id, ProductDto productDto);
    public ProductDto removeProduct(int id);
}
