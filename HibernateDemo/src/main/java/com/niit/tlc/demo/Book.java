package com.niit.tlc.demo;

public class Book {

	private int bookId;
	private String bookName;
	private String author;
	private int prize;
	
	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String author, int prize) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.prize = prize;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}
	
	
	
}
