package com.productapp.util;

import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;

public class ProductUtil {
    //some time i need to convert Product to ProductDto
    public static ProductDto convertProductToProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        return productDto;
    }
    public static Product convertProductDtoToProduct(ProductDto productDto){
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        return product;
    }

    //some time i need to convert ProductDto to Product
}
