package com.demoapp.service;

import com.demoapp.dto.Product;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {


    @KafkaListener(topics = "new-hello-topic2",groupId = "new-hello-topic2-group")
    public void consume(Product product) {
        System.out.println(product);
    }

}
