<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Student</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<style>
		h1{
		text-align: center;
		}
		table{
		margin-left: 570px;
		}
	</style>
</head>
<body>
<%@include file="navbar.jsp"%>
	<h1 style=color:Blue;>Check Student Data.</h1>
	
	<% 
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_app","root","root");
		String sql = "SELECT * FROM student";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		%>
		<table border="2px">
		<tr>
			<th>Roll</th>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
			
			<%
			while(rs.next()){
			
			%>
			
			<tr>
				<td><%= rs.getInt(1) %></td>
				<td><%= rs.getString(2) %></td>
				<td><%= rs.getInt(3) %></td>
				<td><%= rs.getString(4) %></td>
				<td><a href=edit.jsp?roll=<%= rs.getInt(1) %>><span class="material-symbols-outlined">
edit
</span></a></td>
				<td><a href=delete?roll=<%= rs.getInt(1) %>><span class="material-symbols-outlined">
delete
</span></a></td>
			</tr>
			
			<%} %>
		</table>
		
		<%
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