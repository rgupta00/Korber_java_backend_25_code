package com.coupon.service;

import com.coupon.dto.Coupon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class CouponServiceImpl implements CouponService {
    private Logger logger= LoggerFactory.getLogger(CouponServiceImpl.class);
    private static Map<String, Coupon> couponMap = new HashMap<>(); // TODO: <String, Coupon
    static {
        couponMap.put("SUP10", new Coupon("SUP10", 10, LocalDateTime.now()));
        couponMap.put("SUP15", new Coupon("SUP15", 15, LocalDateTime.now()));
        couponMap.put("SUP20", new Coupon("SUP20", 20, LocalDateTime.now()));
    }
    @Override
    public Coupon getCouponByCode(String couponCode) {
        logger.info("Inside getCouponByCode: is called");
        Coupon coupon= couponMap.get(couponCode);
        logger.info("Inside getCouponByCode: is finished");
        return coupon;
    }
}
