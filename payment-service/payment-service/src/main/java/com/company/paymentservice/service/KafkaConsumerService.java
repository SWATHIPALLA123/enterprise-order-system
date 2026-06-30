package com.company.paymentservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(
            topics = "notification-topic",
            groupId = "notification-group"
    )
    public void consumeMessage(String message) {

        System.out.println("==================================");
        System.out.println("Kafka Message Received");
        System.out.println("Message : " + message);
        System.out.println("==================================");

    }
}