package com.zensar.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/* 
 *Author: Tushar Sadawarte
 *Creation Date: 25th Jul 2019 05.30PM
 *Modified Date: 30th Jul 2019 10.55AM
 *Version: 4.0
 *Copyright: Zensar Technologies. All rights reserved.
 *Description:This is the persistence class of Hibernate
 */

@Component
@Entity
@Table
public class Product {
	@Id
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		this.productId=0;
		this.name=null;
		this.brand=null;
		this.price=0;
	}
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public Product(int i) {
		// TODO Auto-generated constructor stub
		productId=i;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
