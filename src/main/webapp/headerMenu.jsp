<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
	if(session.getAttribute("userName") == null)
	{
		response.sendRedirect("login.jsp"); 
	}
	%>
	<nav class="navbar">
		<ul class="navbar-nav">
			<li><a href="home.jsp">Home</a></li>
			<li><a href="addBook.jsp">Add New Book</a></li>
			<li><a href="viewBooks.jsp">View Inventory</a></li>
			<li><a href="search.jsp">Search a Book</a></li>
			<li style="float:right;margin-right:10px"><a href="logout.jsp">Logout</a></li>
		</ul>
	</nav>
</body>
</html>