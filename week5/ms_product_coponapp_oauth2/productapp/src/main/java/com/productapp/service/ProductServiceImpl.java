package com.productapp.service;

import com.productapp.ProductappApplication;
import com.productapp.dto.Coupon;
import com.productapp.dto.Product;
import com.productapp.proxyservice.CouponServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class ProductServiceImpl implements ProductService{
    private Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private CouponServiceProxy couponServiceProxy;

    @Override
    public Product getById(int id, String couponCode) {
        logger.info("Inside getById: is called");
        Product productToReturn=new Product(id,"Laptop",
                "Dell",100000.00,null,0.0);

        Coupon coupon=couponServiceProxy.getCouponByCode(couponCode);

        double discountedPrice=(100-coupon.getDiscountPercentage())* productToReturn.getPrice()/100;

        Product product= new Product(id,"Laptop",
                "Dell",100000.00,couponCode,discountedPrice);
        logger.info("Inside getById: is finished");
        return product;
    }
}
