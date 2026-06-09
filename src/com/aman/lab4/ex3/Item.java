package com.aman.lab4.ex3;

public class Item {
	private int id;
	private String title;
	private int numberOfCopies;
	
	
	public Item(int id, String title, int numberOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumberOfCopies() {
		return numberOfCopies;
	}


	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	 public void print() {
	        System.out.println(this);
	 }
	 
	 public void addItem(int copies) {
	        numberOfCopies += copies;
	    }
	 
	 public void checkIn() {
	        numberOfCopies++;
	    }

	    public void checkOut() {
	        if (numberOfCopies > 0)
	            numberOfCopies--;
	        else
	            System.out.println("No copies available");
	    }


	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]";
	}
	
	@Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Item other = (Item) obj;

        return id == other.id;
    }
	
}
