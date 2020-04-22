package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.orderservice;
import com.example.demo.entity.OrderDetails;

@RestController
public class OrderController {
	@Autowired
private orderservice orderservice;
	
	@PostMapping(value="/createorder")
	public int createOrder(@RequestBody OrderDetails orderDetails) {
		return orderservice.createOrder(orderDetails).getOrderId();
		
	}
}
