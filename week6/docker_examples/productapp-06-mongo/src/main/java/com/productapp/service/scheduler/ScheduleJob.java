package com.productapp.service.scheduler;

import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleJob {
    @Autowired
    private ProductService productService;

    @Scheduled(cron = "0/5 * * * * *")
//    @Scheduled(initialDelay = 5000, fixedDelay = 1500)
    public void invalidateCache(){
        System.out.println("****************************************");
        productService.evictAll();
    }
}
