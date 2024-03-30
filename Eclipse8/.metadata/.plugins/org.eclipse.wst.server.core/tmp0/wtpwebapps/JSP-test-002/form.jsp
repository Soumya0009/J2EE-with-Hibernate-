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
	<%@include file="msg.jsp" %>
	<form action="">
		<h1>Login</h1>
		<input type="email" name="email" placeholder="Email" required>
		<input type="password" name="password" placeholder="Password" required>
		<input type="submit" value="Login">
	</form>
</body>
</html>