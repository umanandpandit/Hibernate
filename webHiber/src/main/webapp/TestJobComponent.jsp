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
Configuration cfg = new Configuration();
cfg.configure();

SessionFactory sf = cfg.buildSessionFactory();
Session sess = sf.openSession();
Transaction t = sess.beginTransaction();

Job job = new Job();
job.setDesignation("Project Manager ");
job.setSalary(4500);
job.setJobDescription("Manages Team and Deliveries");

Person person = new Person();
person.setEmailAddress("person@company.com");
person.setJob(job);
person.setName("Person A");

sess.save(person);
t.commit();
sess.close();

sess = sf.openSession();
Person p = (Person)sess.get(Person.class, person.getId());
out.println(p);
sess.close();
sf.close();
%>
</body>
</html>