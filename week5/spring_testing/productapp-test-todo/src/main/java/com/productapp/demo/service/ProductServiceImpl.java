package com.productapp.demo.service;

import com.productapp.demo.dao.ProductDao;
import com.productapp.demo.dao.ProductDaoImpl;

import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<String> getAll(String nameContain) {
        return productDao.getAll().stream().filter(p->p.contains("laptop")).collect(Collectors.toList());
    }
}
