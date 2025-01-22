package com.productapp.service;

import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoJdbcImpl;
import com.productapp.dao.ProductDaoMapImpl;

import java.util.List;
// :(
public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<String> getAllProducts() {
        return productDao.getAll();
    }
}
