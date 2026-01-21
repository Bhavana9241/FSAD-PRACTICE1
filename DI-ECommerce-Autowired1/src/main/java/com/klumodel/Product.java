package com.klumodel;

import org.springframework.stereotype.Component;

@Component

public class Product {
private int productId;
private String productName;
private double price;
private String category;
public Product() {
	this.productId=101;
	this.productName="Laptop";
	this.price=55000.00;
	this.category="Electronics";
	
	
}
public int getProductId() {
	return productId;
}
public String getProductName() {
	return productName;
}
public double getprice() {
	return price;
}
public String getcategory() {
	return category;
}
}
