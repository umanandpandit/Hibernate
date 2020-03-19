<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page
import="org.hibernate.*,
org.hibernate.boot.*,
org.hibernate.boot.registry.StandardServiceRegistryBuilder,
org.hibernate.cfg.Configuration,
java.util.*,
com.niit.hibernate.webapp.*"

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Session s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
Transaction t = s.beginTransaction();

Emp e1 = new Emp("Vikash", new Address("Noida", "India",201301));
s.save(e1);
Emp e2 = new Emp("katiyar", new Address("kanpur", "India",201301));
s.save(e2);

t.commit();
s.close();
out.println("Successfull");

%>

</body>
</html>