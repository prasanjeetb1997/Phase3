package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private String ShoeName;
	private String ShoeCategory;
	
	
	public Product(String shoeName, String shoeCategory) {
		super();
		ShoeName = shoeName;
		ShoeCategory = shoeCategory;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getShoeName() {
		return ShoeName;
	}
	public void setShoeName(String shoeName) {
		ShoeName = shoeName;
	}
	public String getShoeCategory() {
		return ShoeCategory;
	}
	public void setShoeCategory(String shoeCategory) {
		ShoeCategory = shoeCategory;
	}

	
	
}

