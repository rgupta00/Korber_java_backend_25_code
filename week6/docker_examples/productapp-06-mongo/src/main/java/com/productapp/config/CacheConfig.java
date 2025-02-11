package com.productapp.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.productapp"})
public class CacheConfig {
    //i want to configure in memory cache
    @Bean
    public CacheManager cacheManager(){
        ConcurrentMapCacheManager cacheManager=
                new ConcurrentMapCacheManager("products");
        return cacheManager;
    }
}
