<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! 
		static int i = 10;
		public void  m1() {
			System.out.println("I am M1 from jsp file");
		}
	%>
	<%
		m1();
	%>
</body>
</html>