package com.niit.hiberannotations;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.OneToOne;

@Entity
@Table(name = "BOOK1")
public class Book1 {

	@Id
	@Column(name = "BOOK_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String description;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "PUBLISHED")
	private Date publishedDate ;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AUTHOR_ID")
	private Author author;
	
	public Book1(String title, String description, Date publishedDate, Author author) {
		super();
		this.title = title;
		this.description = description;
		this.publishedDate = publishedDate;
		this.author = author;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public void setAuthor(Author author2) {
		// TODO Auto-generated method stub
		
	}
	public Author getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
