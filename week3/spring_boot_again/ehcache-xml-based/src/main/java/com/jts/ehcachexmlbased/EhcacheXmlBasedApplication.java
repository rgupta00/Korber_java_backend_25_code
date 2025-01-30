package com.jts.ehcachexmlbased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EhcacheXmlBasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcacheXmlBasedApplication.class, args);
	}

}
