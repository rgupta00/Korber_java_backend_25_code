package com.productapp.model.service;

import com.productapp.model.dao.ProductDao;
import com.productapp.model.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product addProduct(Product product) {
        return productDao.addProduct(product);
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }


    @Override
    public void updateProduct(int productId, Product product) {
        productDao.updateProduct(productId, product);
    }

    @Override
    public void deleteProduct(int productId) {
        productDao.deleteProduct(productId);
    }

    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }
}
