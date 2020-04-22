package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CustomerService;
import com.example.demo.entity.Customer;

@RestController
public class CustomerController {
@Autowired
	private CustomerService customerService;
@GetMapping(value="/getcustomerdetails/{username}/{password}")
public String customerLogin(@PathVariable String username,@PathVariable String password ) throws Exception {
	return customerService.getCustomerDetails(username, password);

}

@PostMapping(value="/createcustomer")
public void createCustomer(@RequestBody Customer customer) {
	customerService.createCustomer(customer);
	
}


}
