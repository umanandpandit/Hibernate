package com.niit.tlc.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf=cfg.buildSessionFactory();
        
        Session ses=sf.openSession();
        
        Transaction t=ses.beginTransaction();
        
        Employee e1=new Employee();
        e1.setFirstName("moksh1");
        e1.setLastName("narang1");
        e1.setSalary(10000);
        
        ses.save(e1);//inserts the object (record)
        t.commit();
        System.out.println("succesfully saved");
        
        ses.close();
        sf.close();
    }
}
