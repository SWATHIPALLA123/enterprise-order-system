package com.company.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.orderservice.client.InventoryClient;
import com.company.orderservice.client.UserClient;
import com.company.orderservice.entity.Order;
import com.company.orderservice.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserClient userClient;

    @Autowired
    private InventoryClient inventoryClient;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    // Save Order
    public Order saveOrder(Order order) {

        Order savedOrder = orderRepository.save(order);

        // Send Kafka Message
        kafkaProducerService.sendMessage(
                "Order Placed Successfully. Order ID : " + savedOrder.getId());

        return savedOrder;
    }

    // Get All Orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // OpenFeign Test Method
    public String checkFeign(Long id) {

        String userResponse = userClient.getUser(id);

        String inventoryResponse = inventoryClient.getInventory(id);

        return "========= OpenFeign Response =========\n"
                + "User Service Response:\n"
                + userResponse
                + "\n\nInventory Service Response:\n"
                + inventoryResponse;
    }
}