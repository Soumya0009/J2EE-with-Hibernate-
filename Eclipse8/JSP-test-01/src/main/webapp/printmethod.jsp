<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print Methods in JSP</title>
</head>
<body>
	<%!String method1;
	String method2;
	String method3;
	String method4;

	public void m1() {

		method1 = "I am M1 Method Variable.";
	}

	public void m2() {

		method2 = "I am M2 Method Variable.";
	}

	public void m3() {

		method3 = "I am M3 Method Variable.";
	}

	public void m4() {

		method4 = "I am M4 Method Variable.";
	}%>

	<%
	m1();
	m2();
	m3();
	m4();

	String allMethods = method1 + "<br>" + method2 + "<br>" + method3 + "<br>" + method4;
	%>
	<%=allMethods%>
</body>
</html>
