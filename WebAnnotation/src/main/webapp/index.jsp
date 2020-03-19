<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="org.hibernate.*,
org.hibernate.boot.*,
org.hibernate.boot.registry.StandardServiceRegistryBuilder,
org.hibernate.cfg.Configuration,
java.util.*,
com.niit.techno.demo.Employee" %>
<html>

<body>
<% 
Configuration configuration = new Configuration();
configuration.configure("hibernate.cfg.xml");

SessionFactory factory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());

Session sess = factory.openSession();
sess.beginTransaction();

Employee e1 = new Employee();
//e1.setId(105);
e1.setFirstName("Vikash");
e1.setLastName("Katiyar");

sess.save(e1);
sess.getTransaction().commit();
out.println("Successfully Saved");

out.println("<br>"+"****************************"+"<br>");
List<Employee> emp = sess.createQuery("from Employee").list();

for(Employee e:emp)
{
out.println("<br>");
out.println(e.getId() +" "+e.getFirstName()+" "+e.getLastName());
}
sess.close();

%>
</body>
</html>
