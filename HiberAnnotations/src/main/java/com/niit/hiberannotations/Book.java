package com.niit.hiberannotations;

import java.util.*;
import javax.persistence.*;
import javax.persistence.OneToOne;

@Entity
@Table (name = "BOOK1")
public class Book 
{
	
	@Id
	@Column (name = "BOOK_ID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String description;
	
	@Temporal (TemporalType.DATE)	//mapping with sql date type
	@Column (name = "PUBLISHED")
	private Date publishedDate;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "AUTHOR_ID")
	private Author author;
	
	public Book() 
	{}

	public Book(String title, String description, Date publishedDate) 
	{
		this.title = title;
		this.description = description;
		this.publishedDate = publishedDate;
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public Date getPublishedDate() 
	{
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) 
	{
		this.publishedDate = publishedDate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) 
	{
		this.author = author;
	}
}