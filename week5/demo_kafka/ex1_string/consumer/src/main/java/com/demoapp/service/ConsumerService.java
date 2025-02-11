package com.demoapp.service;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    /*
    @KafkaListener(topics = "busycoder-demo", groupId = "my_topic_group_id", topicPartitions
		= {@TopicPartition(topic = "busycoder-demo", partitions = {"2"})})
     */
    @KafkaListener(topics = "new-hello-topic", groupId = "t-hello2_group_id", topicPartitions =
            {@TopicPartition(topic = "new-hello-topic", partitions = {"0"})})
    public void consumeOfPartionZero(String message) {
        System.out.println("0000000000 "+ message);
    }

    @KafkaListener(topics = "new-hello-topic", groupId = "t-hello2_group_id", topicPartitions =
            {@TopicPartition(topic = "new-hello-topic", partitions = {"1"})})
    public void consumeOfPartionOne(String message) {
        System.out.println("1111111111 "+ message);
    }

    @KafkaListener(topics = "new-hello-topic", groupId = "t-hello2_group_id", topicPartitions =
            {@TopicPartition(topic = "new-hello-topic", partitions = {"2"})})
    public void consumeOfPartionTwo(String message) {
        System.out.println("22222222 "+ message);
    }

}
