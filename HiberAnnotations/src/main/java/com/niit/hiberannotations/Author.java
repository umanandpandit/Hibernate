package com.niit.hiberannotations;

import javax.persistence.*;
import javax.persistence.OneToOne;

@Entity
@Table (name = "AUTHOR")
public class Author 
{
	
	@Id
	@Column (name = "AUTHOR_ID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	
	@OneToOne (mappedBy = "author")
	private Book book;

	public Author() 
	{}

	public Author(String name, String email) 
	{
		this.name = name;
		this.email = email;
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public Book getBook() 
	{
		return book;
	}

	public void setBook(Book book) 
	{
		this.book = book;
	}
}