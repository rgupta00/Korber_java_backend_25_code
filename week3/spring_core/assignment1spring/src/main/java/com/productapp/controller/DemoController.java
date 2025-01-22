package com.productapp.controller;

import com.productapp.dao.ProductDaoMapImpl;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoController {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
        ProductService ps=ctx.getBean("ps",ProductServiceImpl.class);
        System.out.println(ps.getAllProducts());
    }
}
