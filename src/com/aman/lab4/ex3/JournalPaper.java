package com.aman.lab4.ex3;

public class JournalPaper extends WrittenItem{
	private int yearPublished;
	
	public JournalPaper(int idNumber,
            String title,
            int numCopies,
            String author,
            int yearPublished) {

        super(idNumber, title, numCopies, author);
        this.yearPublished = yearPublished;
    }

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getYearPublished()=" + getYearPublished()
				+ ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getNumberOfCopies()=" + getNumberOfCopies()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

	
}
