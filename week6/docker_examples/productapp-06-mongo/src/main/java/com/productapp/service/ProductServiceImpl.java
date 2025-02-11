package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

//SL=BL+ ccc
// fun req+ non functinal req (aop)
@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;
    private Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @CachePut(value = "products", key = "#result.id")
    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
    @Cacheable(value = "products")
    @Override
    public List<Product> getAll() {
        logger.info("database is hit get all is called............");
        return productRepo.findAll();
    }
    //Spring EL (Expression language)
    @Cacheable(value = "products", key = "#id")
    @Override
    public Product getById(String id) {
        return productRepo
                .findById(id)
                .orElseThrow(()-> new ProductNotFoundException("product with id "+id +" is not found"));
    }
    @CacheEvict(value = "products", key = "#id")
    @Override
    public Product deleteProduct(String id) {
        Product productToDelete= getById(id);
        productRepo.delete(productToDelete);
        return productToDelete;
    }
    @CachePut(value = "products", key = "#id")
    @Override
    public Product updateProduct(String id, Product product) {
        Product productToUpdate= getById(id);
        productToUpdate.setPrice(product.getPrice());
        productRepo.save(productToUpdate);
        return productToUpdate;
    }

    //5 sec
    @CacheEvict(value = "products",allEntries = true)
    @Override
    public void evictAll() {}
}

//@Qualifier(value = "productDaoImplJdbc")

//field: avoid

//setter: optional dep
//ctr injection: mandatory dep