package com.company.orderservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumerService {

    @KafkaListener(topics = "payment-topic", groupId = "order-group")
    public void consumePaymentStatus(String message) {

        System.out.println("==================================");
        System.out.println("Payment Message Received");
        System.out.println("Message : " + message);
        System.out.println("==================================");

        // Later we'll update the order status to PAID here.
    }
}
