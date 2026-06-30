package com.company.paymentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.paymentservice.entity.Payment;
import com.company.paymentservice.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentProducerService paymentProducerService;

    // Save Payment
    public Payment savePayment(Payment payment) {

        Payment savedPayment = paymentRepository.save(payment);

        // Send Kafka Message to Order Service
        paymentProducerService.sendPaymentStatus(
                "Payment Successful for Order ID : " + savedPayment.getOrderId());

        return savedPayment;
    }

    // Get All Payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}