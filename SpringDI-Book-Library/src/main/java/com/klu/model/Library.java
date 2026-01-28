package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
private int LibraryId;
private String LibraryName;
private Book book;

public Library() {
	this.LibraryId=1;
	this.LibraryName="ABC";
}
@Autowired
public void setBook(Book book) {
	this.book=book;
}
public void display() {
	System.out.println("libraryid:"+LibraryId);
	System.out.println("LibraryName"+LibraryName);
	System.out.println("Bookdetails"+book);
}
}
