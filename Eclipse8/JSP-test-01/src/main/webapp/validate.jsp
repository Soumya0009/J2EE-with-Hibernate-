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
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		if(email.equals("soumyaranjanmohanty@gmail.com") && password.equals("soumya")){
			
			out.print("Login Sucess.");
		}else{
			out.print("Login Failed.");
		}
	%>
</body>
</html>