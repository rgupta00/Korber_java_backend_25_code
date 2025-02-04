package com.coupon.service;

import com.coupon.dto.Coupon;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
@Log4j2
public class CouponServiceImpl implements CouponService {
    private static Map<String, Coupon> couponMap = new HashMap<>(); // TODO: <String, Coupon
    static {
        couponMap.put("SUP10", new Coupon("SUP10", 10, LocalDateTime.now()));
        couponMap.put("SUP15", new Coupon("SUP15", 15, LocalDateTime.now()));
        couponMap.put("SUP20", new Coupon("SUP20", 20, LocalDateTime.now()));
    }
    @Override
    public Coupon getCouponByCode(String couponCode) {
        log.info("started getCouponByCode()");
        Coupon coupon= couponMap.get(couponCode);
        log.info("end getCouponByCode()");
        return coupon;
    }
}
