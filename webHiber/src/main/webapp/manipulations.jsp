<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page
	import="org.hibernate.*,
	org.hibernate.cfg.Configuration,
	com.niit.hibernate.webapp.User,
    java.util.*"%>
    
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
		sess.beginTransaction();
		String hql = "update User set password = :password Where id = :id ";
		
		Query query = sess.createQuery(hql);
		query.setParameter("password", "test123");
		query.setParameter("id",1);
		
		int rowAffected= query.executeUpdate();
		if(rowAffected>0){
			out.println("Updated "+ rowAffected + "row. ");
			
		}
 		
		String hql1 = "select count(distinct U.name) from User U" ;
		Query query1 = sess.createQuery(hql1); 
		List results = query1.list(); 
		out.println("<br> Rows Counts =  "+results.get(0));
		
		sess.getTransaction().commit();
		sess.close();
		sf.close();
				
		%>
</body>
</html>