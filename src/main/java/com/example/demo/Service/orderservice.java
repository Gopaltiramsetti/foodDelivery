package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.OrderDetails;
import com.example.demo.repository.OrderRepository;



@Service
public class orderservice {

	@Autowired
	private OrderRepository orderrepo;
	
	public OrderDetails createOrder(OrderDetails orderDetails) {
		return orderrepo.save(orderDetails);
		
	}
}
