package com.company.paymentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentProducerService {

    private static final String TOPIC = "payment-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendPaymentStatus(String message) {
        kafkaTemplate.send(TOPIC, message);
        System.out.println("Payment Status Sent : " + message);
    }
}