package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OrderDetails {
	@Id
	private int orderId;
	private int vendorId;
	private List<Item> itemlist;
	private int totalprice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public List<Item> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	
	
	
	
	

}
