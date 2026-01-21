package com.klumodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
 private int OrderID;
 private String CustomerName;
 private int quantity;
 @Autowired
 private Product product;

  public Order() {
	  this.OrderID=2004;
	  this.CustomerName="Bhavana";
	  this.quantity=4;
  }

 public void display() {
	 System.out.println("The Following are the details");
	 System.out.println("OrderID:"+OrderID);
	 System.out.println("CustmorName:"+CustomerName);
	 System.out.println("Qunatity:"+quantity);
	 System.out.println("ProductId:"+product.getProductId());
	 System.out.println("ProductName:"+product.getProductName());
	 System.out.println("productPrice: "+product.getprice());
	 System.out.println("ProductCategory:"+product.getcategory());
	
	 }
	 
	 
	 
	 
 
 }

