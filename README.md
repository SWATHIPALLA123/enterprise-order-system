# Enterprise Order System

## Overview

Enterprise Order System is a real-time Spring Boot Microservices project that demonstrates communication between multiple services using Spring Cloud, Eureka Service Registry, API Gateway, Apache Kafka, and MySQL.

The system manages orders, payments, users, and inventory through independent microservices.

---

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Cloud
- Spring Data JPA
- Spring Cloud Gateway
- Eureka Server
- OpenFeign
- Apache Kafka
- MySQL
- Maven
- Lombok

---

## Project Structure

```
enterprise-order-system
│
├── service-registry
├── api-gateway
├── user-service
├── order-service
├── payment-service
└── inventory-service
```

---

## Microservices

### Service Registry
- Eureka Server
- Service Discovery

### API Gateway
- Centralized Routing
- Load Balancing
- Gateway for all services

### User Service
- User Management
- Create Users
- View Users

### Order Service
- Create Orders
- Order Processing
- Kafka Producer

### Payment Service
- Payment Processing
- Kafka Consumer
- Store Payment Details

### Inventory Service
- Inventory Management
- Product Availability

---

## Architecture

```
Client
   │
   ▼
API Gateway (8080)
   │
   ├────────► User Service (8081)
   │
   ├────────► Order Service (8082)
   │
   ├────────► Payment Service (8083)
   │
   └────────► Inventory Service (8084)

               │
               ▼
          Eureka Server (8761)

Order Service
      │
      ▼
 Apache Kafka
      │
      ▼
Payment Service

MySQL Database
```

---

## Ports

| Service | Port |
|----------|------|
| Eureka Server | 8761 |
| API Gateway | 8080 |
| User Service | 8081 |
| Order Service | 8082 |
| Payment Service | 8083 |
| Inventory Service | 8084 |
| Kafka | 9092 |
| ZooKeeper | 2181 |

---

## Features

- Spring Boot Microservices
- Service Discovery using Eureka
- API Gateway Routing
- REST APIs
- Kafka Producer & Consumer
- MySQL Integration
- Spring Data JPA
- OpenFeign Communication
- Maven Project
- Layered Architecture

---

## API Endpoints

### User Service

```
POST /users
GET /users
```

### Order Service

```
POST /orders
GET /orders
```

### Payment Service

```
POST /payments
GET /payments
```

### Inventory Service

```
POST /inventory
GET /inventory
```

---

## How to Run

### Start Services

1. Start ZooKeeper
2. Start Kafka
3. Start Eureka Server
4. Start API Gateway
5. Start User Service
6. Start Order Service
7. Start Payment Service
8. Start Inventory Service

---

## Tools Used

- Eclipse IDE
- Postman
- MySQL Workbench
- Apache Kafka
- GitHub

---

## Author

**Swathi Palla**

Java Developer

---

## Future Enhancements

- JWT Authentication
- Docker Support
- Kubernetes Deployment
- Circuit Breaker
- Config Server
- Distributed Tracing
- Monitoring with Prometheus & Grafana

---

## License

This project is developed for learning and demonstration purposes.
