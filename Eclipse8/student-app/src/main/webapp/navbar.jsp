<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="UTF-8">
<title>Navbar</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse justify-content-end"
			id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link" href="add.html"><span class="material-symbols-outlined">
person_add
</span> ADD STUDENT</a> <a
					class="nav-item nav-link" href="view.jsp"><span class="material-symbols-outlined">
person_search
</span> VIEW STUDENT</a> <a
					class="nav-item nav-link" href=""><span class="material-symbols-outlined">
power_rounded
</span> LOGOUT</a>
			</div>
		</div>
	</nav>
</body>
</html>