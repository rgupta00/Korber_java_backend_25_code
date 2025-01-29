package com.productapp.service;

import com.productapp.excetions.ProductNotFoundException;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
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
    public List<Product> getProducts() {
        logger.info("**************************************************************");
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(int id) {
        Product product= productRepo.findById(id)
                .orElseThrow(()-> new ProductNotFoundException("product with id "+ id +" is not found"));
        return product;
    }

    @Override
    public Product addProduct(Product product) {
         productRepo.save(product);
         return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate=getProductById(id);
        productToUpdate.setPrice(product.getPrice());
         productRepo.save(productToUpdate);
        return  productToUpdate;
    }

    @Override
    public Product removeProduct(int id) {
        Product productToRemove=getProductById(id);
        productRepo.delete(productToRemove);

        return productToRemove;
    }
}
