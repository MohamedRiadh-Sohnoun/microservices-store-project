package com.hannibal.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hannibal.orderservice.model.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
