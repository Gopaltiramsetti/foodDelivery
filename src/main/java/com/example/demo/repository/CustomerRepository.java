package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{
	
	
	@Query(value = "SELECT u FROM Customer u where u.name = :username and u.password = :password")
	List<Customer> checkCustomer(@Param("username") String username,@Param("password") String password);

}
