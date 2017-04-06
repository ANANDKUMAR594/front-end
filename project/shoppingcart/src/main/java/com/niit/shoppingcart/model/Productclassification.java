package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="classification")
public class Productclassification {
	private int id;
	private String electronics;
	private String appliance;
	private String men;
	private String women;
	private String babyandkids;
	private String homeandfurnitures;
	private String books;
	private String movies;
	private String offerzone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getElectronics() {
		return electronics;
	}
	public void setElectronics(String electronics) {
		this.electronics = electronics;
	}
	public String getAppliance() {
		return appliance;
	}
	public void setAppliance(String appliance) {
		this.appliance = appliance;
	}
	public String getMen() {
		return men;
	}
	public void setMen(String men) {
		this.men = men;
	}
	public String getWomen() {
		return women;
	}
	public void setWomen(String women) {
		this.women = women;
	}
	public String getBabyandkids() {
		return babyandkids;
	}
	public void setBabyandkids(String babyandkids) {
		this.babyandkids = babyandkids;
	}
	public String getHomeandfurnitures() {
		return homeandfurnitures;
	}
	public void setHomeandfurnitures(String homeandfurnitures) {
		this.homeandfurnitures = homeandfurnitures;
	}
	public String getBooks() {
		return books;
	}
	public void setBooks(String books) {
		this.books = books;
	}
	public String getMovies() {
		return movies;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}
	public String getOfferzone() {
		return offerzone;
	}
	public void setOfferzone(String offerzone) {
		this.offerzone = offerzone;
	}
	
}
