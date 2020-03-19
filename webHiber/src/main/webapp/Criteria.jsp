<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@ page import="org.hibernate.*,
org.hibernate.cfg.Configuration,
java.util.*,
com.niit.hibernate.webapp.User,
org.hibernate.criterion.*,
java.util.Iterator" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%	Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		
		Criteria cr = sess.createCriteria(User.class);
		
		cr.add(Restrictions.like("name", "a%" ));
		cr.add(Restrictions.eq("id", 2 ));
		
	//cr.addOrder(Order.asc("name"));
	//cr.setMaxResult(5);
	
		List<User> list = (List<User>) cr.list();
		out.println("List of Employees::"+"<br>");
		out.println("<table border='1'>");
		out.println("<tr bgcolor='yellow'>");
		out.println("<th> User Id</th>");
		out.println("<th> User Name</th>");
		out.println("<th> Email </th>");
		out.println("</tr>");
		Iterator it=list.iterator();
		while(it.hasNext()) {
		User u=(User)it.next();
		out.println("<tr bgcolor='aqua'>");
		out.println("<td>"+u.getId() + "</td>");
		out.println("<td>"+ u.getName() + "</td>");
		out.println("<td>"+ u.getEmail()+"</td>");
		out.println("</tr>");
		}
		out.println("</table>");

		sess.close();
		sf.close();
		
	%>
</body>
</html>