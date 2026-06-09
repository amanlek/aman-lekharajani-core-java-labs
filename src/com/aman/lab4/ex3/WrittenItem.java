package com.aman.lab4.ex3;

public class WrittenItem extends Item {
	private String author;
	
	
	
	 public WrittenItem(int idNumber, String title,
	            int numCopies, String author) {

	        super(idNumber, title, numCopies);
	        this.author = author;
	    }
	 
	 public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }
	    
	    

	    @Override
	    public String toString() {
	        return super.toString() +
	                ", author=" + author;
	    }
}
