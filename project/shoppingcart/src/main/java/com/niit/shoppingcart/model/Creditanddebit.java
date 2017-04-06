package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="debit&credit")
public class Creditanddebit {
	private int id;
	private String bankname;
	private long nooncard;
	private int cvv;
	private int otp;
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
	public long getNooncard() {
		return nooncard;
	}
	public void setNooncard(long nooncard) {
		this.nooncard = nooncard;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	

}
