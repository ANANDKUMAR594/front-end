package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products { 
 private int id;
 private String name;
 private String companyname;
 private int cost;
 private String description;
 private int totalpiece;
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
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getTotalpiece() {
	return totalpiece;
}
public void setTotalpiece(int totalpiece) {
	this.totalpiece = totalpiece;
}
 
 

}
