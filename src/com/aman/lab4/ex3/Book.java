package com.aman.lab4.ex3;

public class Book extends WrittenItem {
	public Book(int id, String title, int numberOfCopies, String author) {
		super(id, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return "Book [" + super.toString()+ "]";
	}
	
	
}
