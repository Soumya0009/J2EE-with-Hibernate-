<%@ page import="com.org.Person" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="p" class="com.org.Person" scope="session">
		<jsp:setProperty name="p" property="id" value="111"/>
		<jsp:setProperty name="p" property="name" value="Will Smith"/>
		<jsp:setProperty name="p" property="age" value="22"/>
		
		<h1>
		<jsp:getProperty name="p" property="id"/><br>
		<jsp:getProperty name="p" property="name"/><br>
		<jsp:getProperty name="p" property="age"/><br>
	</h1>
	</jsp:useBean>
	
</body>
</html>