<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		session.setAttribute("em", email);
		
		RequestDispatcher rd = request.getRequestDispatcher("second.jsp");
		rd.forward(request, response);
		
	%>
</body>
</html>