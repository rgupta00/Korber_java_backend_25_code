package com.coupon.controller;

import com.coupon.dto.Coupon;
import com.coupon.service.CouponService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {
    private CouponService couponServicel;

    public CouponController(CouponService couponService) {
        this.couponServicel = couponService;
    }
    //http://localhost:8083/coupon/SUP10
    @GetMapping("coupon/{couponCode}")
    public Coupon getCouponByCode(@PathVariable String couponCode) {
        return couponServicel.getCouponByCode(couponCode);
    }
}
