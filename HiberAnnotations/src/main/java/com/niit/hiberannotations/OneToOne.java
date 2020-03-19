package com.niit.hiberannotations;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class OneToOne {

	public static void main(String[] args) {
		
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory(
		new StandardServiceRegistryBuilder().configure().build());
		Session sess= factory.openSession();
		sess.beginTransaction();

		Customer customer=new Customer();
		customer.setName("Vikash Katiyar");
		customer.setEmail("katiyar918@.com");
		
		Address address=new Address();
		address.setAddressLine1("D-17 Bhisanpura");
		address.setCity("Noida");
		address.setCountry("India");
		address.setPincode(201301);
		address.setCustomer(customer);
		customer.setAddress(address);
		sess.save(customer);
		sess.getTransaction().commit();
		//sess.close();
		System.out.println("Table Created & Record successfully Inserted");

		System.out.println("**** Display Data *****");
		TypedQuery<Customer> query=sess.createQuery("from Customer",Customer.class);
		List<Customer> list=query.getResultList();

		Iterator<Customer> itr=list.iterator();
		while(itr.hasNext()){
		Customer cust=itr.next();
		System.out.println("<br>"+cust.getCustomerId()+" "+cust.getName()+" "+cust.getEmail());
		Address address1=cust.getAddress();
		System.out.println(address.getAddressLine1()+" "+address.getCity()+" "+
		address.getState()+" "+address.getCountry()+" "+address.getPincode());
		}
		sess.close();
		System.out.println("Success");

		
		
		sess.close();
	}

}