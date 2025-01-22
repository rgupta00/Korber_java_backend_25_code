package com.productapp.dao;

import java.util.List;

public class ProductDaoJdbcImpl implements ProductDao{
    @Override
    public List<String> getAll() {
        System.out.println("---jdbc imp impl----");
        return List.of("laptop", "mobile", "tv");
    }
}
