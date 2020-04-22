package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	

	public String getCustomerDetails(String username,String password) throws Exception {
		

		List<Customer> list = customerRepository.checkCustomer(username, password);
		if(list != null && list.size() > 0)
		{
			return "LOGGED IN SUCCESSFULLY";
		}else
		{
			throw new Exception("Authentication failed");
		
		}
	}
	
	

	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}
	

}
