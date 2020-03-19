package com.niit.hiberannotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        
        SessionFactory factory=configuration.buildSessionFactory
        		(new StandardServiceRegistryBuilder().configure().build());
        
        
        
        Session sess=factory.openSession();
        sess.beginTransaction();
        
        
        Employee e1=new Employee();
        e1.setId(105);
        e1.setFirstName("Chandler");
        e1.setLastName("Bing");
        
        
        sess.save(e1);
        sess.getTransaction().commit();
        System.out.println("successfully saved!!");
        
    }
}
