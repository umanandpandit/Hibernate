package com.niit.hiberannotations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class OneForiegn {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory(
		new StandardServiceRegistryBuilder().configure().build());
		Session session= factory.openSession();
		session.beginTransaction();
		
		Book newBook = new Book();
		newBook.setTitle("Hibernate Made Easy");
		newBook.setDescription("Simplified Data Persistence with Hibernate and JPA");
		newBook.setPublishedDate(new Date());

		newBook.setAuthor(new Author("Cameron Wallace McKenzie", "Cameron@gmail.com"));


		Long bookId = (Long)session.save(newBook);


		Book book = (Book) session.get(Book.class, bookId);
		System.out.println("Book's Title: " + book.getTitle());
		System.out.println("Book's Description: " + book.getTitle());

		Author author = book.getAuthor();
		System.out.println("Author's Name: " + author.getName());
		System.out.println("Author's Email: " + author.getEmail());

		session.getTransaction().commit();
		session.close();
		
	}

}
