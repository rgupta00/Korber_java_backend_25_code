package com.demoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Value(("{topic.name}"))
    private String topicName;

    public void sendMessage(String message) {
        //Async method
        CompletableFuture<SendResult<String, String>> result =
                kafkaTemplate.send("new-hello-topic",2,null, message);
        //kafkaTemplate.send("busycoder-demo", 3, null(key), data);

//        result.whenComplete((sendResult, throwable) -> {
//            if (throwable != null) {
//                throwable.printStackTrace();
//            } else {
//                System.out.println("Message sent successfully with offset " + sendResult.getRecordMetadata().offset());
//            }
//        });
    }


}
