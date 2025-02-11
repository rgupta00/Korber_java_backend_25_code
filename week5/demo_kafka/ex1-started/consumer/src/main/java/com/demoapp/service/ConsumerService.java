package com.demoapp.service;

import com.demoapp.dto.Product;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	@KafkaListener(topics = "my_topic2_sb1", groupId = "my_topic_group_id")
	public void consume(String message) {
		System.out.println("------------------------");
		System.out.println(message);
	}
}
