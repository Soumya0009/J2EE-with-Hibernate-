<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print all the numbers</title>
</head>
<body>
	<%! public void m1(){
		
	}
	%>
	<%
	for (int i = 1; i <= 5; i++) {
	%>
	<%=i%>
	<br>
	<%
	}
	m1();
	%>
</body>
</html>