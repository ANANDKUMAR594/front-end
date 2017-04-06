package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ebanking")
public class Ebanking {
	private int id;
	private String bankname;
	private String username;
	private long password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	

}
