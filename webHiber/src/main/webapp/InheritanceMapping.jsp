<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.hibernate.*,
org.hibernate.cfg.Configuration,
com.niit.hibernate.webapp.Person1,
com.niit.hibernate.webapp.Employee1,
com.niit.hibernate.webapp.*,

java.util.*" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory factory = cfg.buildSessionFactory();
Session sess= factory.openSession();
sess.beginTransaction();

Person1 person = new Person1("Steve", "Balmer");
sess.save(person);

Employee1 employee =  new Employee1("James", "Gosling", "Marketing", new Date());
sess.save(employee);
out.println("Executed Successfully");
sess.getTransaction().commit();
sess.close();

%>


</body>
</html>