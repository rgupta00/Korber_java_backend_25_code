package com.wclient.wclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.wclient.wclient.serviceproxy")
@SpringBootApplication
public class WclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WclientApplication.class, args);
	}

}
