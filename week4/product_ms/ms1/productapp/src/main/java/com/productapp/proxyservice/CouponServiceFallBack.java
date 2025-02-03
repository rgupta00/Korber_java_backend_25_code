package com.productapp.proxyservice;

import com.productapp.dto.Coupon;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CouponServiceFallBack implements CouponServiceProxy {

    @Override
    public Coupon getCouponByCode(String couponCode) {
        return new Coupon("SUP10", 10, LocalDateTime.now());
    }
}
