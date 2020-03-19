<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="org.hibernate.*,
com.niit.hibernate.webapp.*,
    java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HQL Select</title>
</head>
<body>

	<%
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();

		Query query = s.createQuery("from User");
		List<User> list = (List<User>) query.list();

		out.println("<h1> List of Employees </h1>");

		out.println("<table  border=\"1\">");

		out.println("<tr>  <th> ID </th> <th> Name </th>" +
		"<th> Email </th> </tr>");

		for (User st : list) {
			out.println("<tr> <td>" + st.getId() + "</td><td>" +
		st.getName() + "</td><td>" + st.getEmail() + "</td><br>");
		}

		out.println("</table>");

		out.println("<br>");

		query = s.createQuery("select count(*) from User");
		List<Integer> list2 = query.list();
		out.println("<h1> Total Name :: ");
		out.println(list2.get(0) + "<br>");
		out.println("</h1> <br/>");

		query = s.createQuery("from User U where U.id=:id");
		query.setInteger("id", 3);
		List<User> list3 = (List<User>) query.list();
		out.println("<h1> List of Employees with Criteria :: ");

		for (User st : list3) 
		{
			out.println(st.getId() + " / " + st.getName() + " / " 
		+ st.getEmail() + "</h1> <br>");
		}

		s.getTransaction().commit();
		s.close();
		sf.close();
	%>
</body>
</html>