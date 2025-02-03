package com.kafkademo.service;

import com.kafkademo.dto.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageConsumer {

   	@RetryableTopic(attempts = "4", backoff =@Backoff(delay = 3000,multiplier = 1.5, maxDelay = 15000)
	,exclude = {NullPointerException.class})// 3 topic N-1
    @KafkaListener(topics = "${app.topic.name}", groupId = "busycoder-group")
    public void consumeEvents(Product p, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                              @Header(KafkaHeaders.OFFSET) long offset) {
		//throw exception in case of price >100000
    }

    @DltHandler
    public void listenDLT(Product p, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
			@Header(KafkaHeaders.OFFSET) long offset) {
        log.info("DLT Received : {} , from {} , offset {}",p.getName(),topic,offset);
    }
}