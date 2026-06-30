package com.company.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.paymentservice.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}