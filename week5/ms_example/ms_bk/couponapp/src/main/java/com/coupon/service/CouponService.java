package com.coupon.service;


import com.coupon.dto.Coupon;

public interface CouponService {
    public Coupon getCouponByCode(String couponCode);
}
