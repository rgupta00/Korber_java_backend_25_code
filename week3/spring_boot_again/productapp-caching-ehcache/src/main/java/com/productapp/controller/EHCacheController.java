package com.productapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EHCacheController {

	@Autowired
	private EHCacheService serEhCacheService;

	@GetMapping("/areaOfSquare")
	public ResponseEntity<Double> areaofSquare(@RequestParam int side) {
		return ResponseEntity.ok(serEhCacheService.areaOfSquare(side));
	}
	
	@GetMapping(path = "/evict")
	public ResponseEntity<String> evictCache() {
		serEhCacheService.clearCache();
		return ResponseEntity.ok("Cache successfully clean");
	}

}
