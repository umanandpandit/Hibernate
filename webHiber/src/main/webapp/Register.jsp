<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.niit.hibernate.webapp.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Hibernate Demo</title>
</head>
<body>
<jsp:useBean id="userBean" class="com.niit.hibernate.webapp.User"></jsp:useBean>
<jsp:setProperty property="*" name="userBean"/>

<%
int i = UserDao.register(userBean);

if (i>0)
{
	out.print("You are successfully registered");
}
%>
</body>
</html>