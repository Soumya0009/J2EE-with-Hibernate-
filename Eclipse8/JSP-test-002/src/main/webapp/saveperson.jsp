<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usingjdbc","root","root");
			String sql = "INSERT INTO person VALUES(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, gender);
			ps.execute();
			con.close();
		%>
			
			<%@include file="home.jsp" %>
			
	<%
	out.print("<a href=viewperson.jsp>View Person</a>");
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