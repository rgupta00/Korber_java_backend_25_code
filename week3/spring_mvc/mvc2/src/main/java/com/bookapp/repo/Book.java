package com.bookapp.repo;

public class Book  {
	private long id;
	private String isbn;
	private String title;
	private String author;
	private double price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long id, String isbn, String title, String author, double price) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	
}
