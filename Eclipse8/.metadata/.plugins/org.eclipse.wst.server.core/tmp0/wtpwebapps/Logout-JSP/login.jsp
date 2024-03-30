<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="validate" method="get">
		<input type="email" name="email" placeholder="Email" required><br><br>
		<input type="password" name="password" placeholder="Password" required><br><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>