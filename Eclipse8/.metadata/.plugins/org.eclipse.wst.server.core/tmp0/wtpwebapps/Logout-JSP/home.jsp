<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("e")==null){
		
		response.sendRedirect("login.jsp");
		
	}
%>
<h1>WELCOME TO HOME</h1>
<a href="msg.jsp">Messege</a> <br>
<a href="logout">Logout</a> <br>
</body>
</html>