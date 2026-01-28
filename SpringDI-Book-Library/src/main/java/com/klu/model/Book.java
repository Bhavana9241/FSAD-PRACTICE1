package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
private String Tittle;
private double price;
private String author;

	public Book(){
		this.Tittle="housemaid";
		this.price=2000;
		this.author="john";
	}
	

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public void setTittle(String tittle) {
	this.Tittle = tittle;
}
public String getTittle() {


return Tittle;

}
@Override
public String toString() {
	return "Book[Tittle="+Tittle+",author="+author+",price="+price+"]";
}

}
