package com.demoapp.service;

import com.demoapp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, Product> kafkaTemplate;

    @Value(("{topic.name}"))
    private String topicName;

    //When u are sending the data : data
    public void sendMessage(Product product) {
//        kafkaTemplate.send("new-hello-topic2","A", product);
        kafkaTemplate.send("new-hello-topic2","A", product);
    }
}
