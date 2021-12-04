<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="headerMenu.jsp" %>

<%
String userName = (String)session.getAttribute("userName");
%>

<div align="center">
<h2>Book Inventory Helper</h2>
<label>Welcome <%= userName %></label>
</div>

</body>
</html>