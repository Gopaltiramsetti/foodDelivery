package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vendor_menu {

@Id
private int id;

private String name;
private int price;
private int vendorid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getVendorid() {
	return vendorid;
}
public void setVendorid(int vendorid) {
	this.vendorid = vendorid;
}



}
