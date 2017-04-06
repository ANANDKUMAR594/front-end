package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="COD")
public class Cashondelivery {
	private int id;
	private String address;
	private int deliverytax;
	private int amount;
	private int phonenumber;
	private int quantity;
	private String prodect;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDeliverytax() {
		return deliverytax;
	}
	public void setDeliverytax(int deliverytax) {
		this.deliverytax = deliverytax;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProdect() {
		return prodect;
	}
	public void setProdect(String prodect) {
		this.prodect = prodect;
	}
	 
}
