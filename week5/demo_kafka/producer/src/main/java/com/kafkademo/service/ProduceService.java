package com.kafkademo.service;

import com.kafkademo.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ProduceService {
	@Autowired
	private KafkaTemplate<String, Product> kafkaTemplate;

	public void produce(Product product) {
		System.out.println("message is send....");
		kafkaTemplate.send("t-hello2", product);
	}
}