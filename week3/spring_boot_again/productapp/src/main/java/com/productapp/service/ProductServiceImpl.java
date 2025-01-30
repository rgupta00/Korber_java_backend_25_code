package com.productapp.service;

import com.productapp.dto.ProductDto;
import com.productapp.excetions.ProductNotFoundException;
import com.productapp.entities.Product;
import com.productapp.repo.ProductRepo;
import com.productapp.util.ProductUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;
    private Logger logger=org.slf4j.LoggerFactory.getLogger(ProductServiceImpl.class);


    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<ProductDto> getProducts() {
        logger.info("**************************************************************");
        return productRepo.findAll().stream().map(ProductUtil::convertProductToProductDto).toList();
    }

    @Override
    public ProductDto getProductById(int id) {
        ProductDto productDto= productRepo.findById(id).map(ProductUtil::convertProductToProductDto)
                .orElseThrow(()-> new ProductNotFoundException("product with id "+ id +" is not found"));
        return productDto;
    }

    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Product product = productRepo.save(ProductUtil.convertProductDtoToProduct(productDto));
        return ProductUtil.convertProductToProductDto(product);
    }

    @Override
    public ProductDto updateProduct(int id, ProductDto productDto) {
        ProductDto productDtoToUpdate=getProductById(id);
        productDtoToUpdate.setPrice(productDto.getPrice());
        productRepo.save(ProductUtil.convertProductDtoToProduct(productDtoToUpdate));
        return  productDtoToUpdate;
    }

    @Override
    public ProductDto removeProduct(int id) {
        ProductDto productDtoToRemove=getProductById(id);
        productRepo.delete(ProductUtil.convertProductDtoToProduct(productDtoToRemove));
        return productDtoToRemove;
    }
}
