<%@ page import="com.org.Person" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Person p = new Person();
p.setId(101);
p.setName("Soumya");
p.setAge(23);

out.println(p.getId());
out.println(p.getName());
out.println(p.getAge());
%>
</body>
</html>