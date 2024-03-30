<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
<style>
  body {
    background-color: e3f2fd;
    font-family: "Asap", sans-serif;
  }

  .login {
    overflow: hidden;
    background-color: white;
    padding: 40px 30px 30px 30px;
    border-radius: 10px;
    position: absolute;
    top: 50%;
    left: 50%;
    width: 400px;
    transform: translate(-50%, -50%);
    transition: transform 300ms, box-shadow 300ms;
    box-shadow: 5px 10px 10px rgba(2, 128, 144, 0.2);
  }

  .login::before,
  .login::after {
    content: "";
    position: absolute;
    width: 600px;
    height: 600px;
    border-top-left-radius: 40%;
    border-top-right-radius: 45%;
    border-bottom-left-radius: 35%;
    border-bottom-right-radius: 40%;
    z-index: -1;
  }

  .login::before {
    left: 40%;
    bottom: -130%;
    background-color: rgba(69, 105, 144, 0.15);
    animation: wawes 6s infinite linear;
  }

  .login::after {
    left: 35%;
    bottom: -125%;
    background-color: rgba(2, 128, 144, 0.2);
    animation: wawes 7s infinite;
  }

  .login > input {
    font-family: "Asap", sans-serif;
    display: block;
    border-radius: 5px;
    font-size: 16px;
    background: transparent;
    width: 100%;
    border: 1px solid e3f2fd;
    padding: 10px 10px;
    margin: 15px -10px;
  }

  .login > input[type="submit"] {
    font-family: "Asap", sans-serif;
    cursor: pointer;
    color: #fff;
    font-size: 16px;
    text-transform: uppercase;
    width: 80px;
    border: 0;
    padding: 10px 0;
    margin-top: 10px;
    margin-left: -5px;
    border-radius: 5px;
    background-color: rgba(244, 91, 105, 1);
    transition: background-color 300ms;
  }

  .login > input[type="submit"]:hover {
    background-color: rgba(244, 91, 105, 0.95);
  }

  a {
    text-decoration: none;
    color: blue;
    position: absolute;
    right: 10px;
    bottom: 10px;
    font-size: 12px;
  }
  a:hover{
  text-decoration: underline;
  }
  
  h1{
  color: rgba(244, 91, 105, 0.95);
  margin-bottom: 10px;
  }

  @keyframes wawes {
    from {
      transform: rotate(0);
    }
    to {
      transform: rotate(360deg);
    }
  }
</style>
</head>
<body>
	<%
	String roll = request.getParameter("roll");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_app","root","root");
		String sql = "SELECT * FROM student where roll ="+roll ;
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();%>
		<form class="login" action="update">
	<h1>Add Data</h1>
   <input type="number" name="roll" placeholder="Roll No" value="<%=rs.getInt(1)%>" readonly>
    <input type="text" name="name" placeholder="Name" value="<%=rs.getString(2)%>">
    <input type="number" name="age" placeholder="Age" value="<%=rs.getInt(3)%>">
    <input type="text" name="gender" placeholder="Gender" value="<%=rs.getString(4)%>">
    <input type="submit" value="Update">
    <a href="home.jsp">Go to home page</a>
		</form>
		<% con.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	%>
</body>
</html>