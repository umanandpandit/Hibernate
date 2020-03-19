package com.niit.tlc.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookDAO {

	 public static void main( String[] args )
	    {
	        Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        
	        SessionFactory sf=cfg.buildSessionFactory();
	        
	        Session ses=sf.openSession();
	        
	        Transaction t=ses.beginTransaction();
	        
	        Book b1=new Book();
	        b1.setBookName("bookName");
	        b1.setAuthor("Moksh");
	        b1.setPrize(120);
	        
	        ses.save(b1);//inserts the object (record)
	        t.commit();
	        System.out.println("succesfully saved");
	        
	        ses.close();
	        sf.close();
	    }
}
