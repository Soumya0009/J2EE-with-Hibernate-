<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="home.jsp" %>
	<% 
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/usingjdbc","root","root");
		Statement statement = connection.createStatement();
		String qrrString = "Select*From person";

		ResultSet rs = statement.executeQuery(qrrString);
		
		out.print("<html><body>");
		out.print("<table border=2px><tr>");
		out.print("<th>Id</th>");
		out.print("<th>Name</th>");
		out.print("<th>Age</th>");
		out.print("<th>Gender</th>");
		out.print("</tr>");
		while (rs.next()) {
			
			out.print("</tr>");
			out.print("<th>"+rs.getInt(1) +"</th>");
			out.print("<th>"+rs.getString(2)+"</th>");
			out.print("<th>"+rs.getInt(3)+"</th>");
			out.print("<th>"+rs.getString(4)+"</th>");
			out.print("</tr>");

		}
		out.print("</body></html>");

		connection.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	%>
</body>
</html>