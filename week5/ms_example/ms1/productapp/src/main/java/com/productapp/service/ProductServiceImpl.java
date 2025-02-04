package com.productapp.service;

import com.productapp.dto.Coupon;
import com.productapp.dto.Product;
import com.productapp.proxyservice.CouponServiceProxy;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService{

   @Autowired
   private CouponServiceProxy couponServiceProxy;

    @Override
    public Product getById(int id, String couponCode) {

        log.info("started ProductServiceImpl.getById()");
        Product productToReturn = new Product(id, "Laptop",
                "Dell", 100000.00, null, 0.0);

        Coupon coupon = couponServiceProxy.getCouponByCode(couponCode);

        double discountedPrice = (100 - coupon.getDiscountPercentage()) * productToReturn.getPrice() / 100;

        productToReturn.setDiscountCoupon(coupon.getCouponCode());
        productToReturn.setDiscountedPrice(discountedPrice);
        log.info("end ProductServiceImpl.getById()");
        return productToReturn;

    }
}
