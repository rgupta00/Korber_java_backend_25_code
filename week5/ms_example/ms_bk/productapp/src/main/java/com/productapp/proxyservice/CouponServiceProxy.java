package com.productapp.proxyservice;

import com.productapp.dto.Coupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "couponapp", url = "http://localhost:8083")
public interface CouponServiceProxy {
    @GetMapping("coupon/{couponCode}")
    public Coupon getCouponByCode(@PathVariable String couponCode);
}
