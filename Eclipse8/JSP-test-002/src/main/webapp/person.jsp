<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
		form{
			border: 2px solid;
			width: 250px;
		}
		input{
		margin:10px;
		margin-bottom: 5px;
		}
		h1{
		margin:10px;
		}
	</style>

</head>
<body>
<%@include file="home.jsp" %>
	<form action="saveperson.jsp"> 
		<h1>Enter Person Data</h1>
		<input type="number" name="id" placeholder="ID" required>
		<input type="text" name="name" placeholder="Name" required>
		<input type="number" name="age" placeholder="Age" required>
		<input type="text" name="gender" placeholder="Gender" required>
		
		<input type="submit" value="Save">
	</form>
</body>
</html>