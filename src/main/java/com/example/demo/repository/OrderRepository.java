package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderDetails;

public interface OrderRepository  extends JpaRepository<OrderDetails,Integer>{

}
