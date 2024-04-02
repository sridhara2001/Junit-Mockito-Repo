package com.bookapp.model;

public class Book {
	private String title;
    private String author;
    private double price;
    private Integer bookId;
    
    public Book() {
		super();
	}

	public Book(String title, String author, double price, Integer bookId) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", bookId=" + bookId + "]";
	}
	
    
    
   
}
