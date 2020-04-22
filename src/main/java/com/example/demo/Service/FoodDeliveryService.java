package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vendor;
import com.example.demo.entity.Vendor_menu;
import com.example.demo.repository.MenuRepository;
import com.example.demo.repository.VendorRepository;


@Service
public class FoodDeliveryService {
	@Autowired
	private VendorRepository vendorRepository;
	
	@Autowired
	private MenuRepository menuRepository;
	public List<Vendor> getVendorDetails(){
		
		return vendorRepository.findAll();
	}
	public void createVendor(Vendor vendor) {
		
		vendorRepository.save(vendor);
	}
	public void createMenuForVendor(Vendor_menu vendor_menu) {
		menuRepository.save(vendor_menu);	
	}

	
}
