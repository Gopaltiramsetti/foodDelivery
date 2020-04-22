package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.FoodDeliveryService;
import com.example.demo.entity.Vendor;
import com.example.demo.entity.Vendor_menu;

@RestController
public class FoodDeliveryController {
	
	@Autowired
	private FoodDeliveryService fds;
	
	@GetMapping(value="/getvendordetails")
	public List<Vendor> getVendorDetails(){
		return fds.getVendorDetails();
	}
	@PostMapping(value="/createvendor")
	public void createVendor(@RequestBody Vendor vendor) {
		
		fds.createVendor(vendor);
		
	}
	
	@PostMapping(value="/createmenuforvendor")
	public void createMenuForVendor(@RequestBody Vendor_menu vendor_menu) {
		fds.createMenuForVendor(vendor_menu);
		
		
	}
	

}
