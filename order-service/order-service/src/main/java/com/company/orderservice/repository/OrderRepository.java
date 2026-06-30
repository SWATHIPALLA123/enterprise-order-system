package com.company.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}