package com.productapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EHCacheService {

	private final Logger LOG = LoggerFactory.getLogger(EHCacheService.class);

	@Cacheable(value = "areaOfSquareCache", key = "#side")
	public double areaOfSquare(int side) {
		LOG.info("Calculate the area of a SQUARE with a side of {}", side);
		return side * side;
	}
	
	@CacheEvict(cacheNames = { "areaOfSquareCache" }, allEntries = true)
	public void clearCache() {
		LOG.info("Clear Cache...");
	}
}
