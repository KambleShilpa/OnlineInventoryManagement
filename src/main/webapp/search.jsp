<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="dao.bookManagementDAO"%>
<%@page import="pojo.Book"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
<%@ include file="headerMenu.jsp" %>  
<div align="center" style="padding-top:25px;">
	<form action="search.jsp">
		<label>Enter Product ID: </label>
		<input type="text" name="prodId" size="25" class="searchTextField"/>
		<button class="actionBtn">Search</button>
	</form>
</div> 
	<table align="center" class="productTable">
		<thead>
			<tr>
				<th>BookID</th>
				<th>Name</th>
				<th>Author</th>
				<th>Category</th>
				<th>Description</th>
				<th>Units Available</th>
				<th>Selling Price</th>
				<th>Cost Price</th>
				<th>Status</th>
				<th colspan="2">Actions</th>
			</tr> 
		</thead>
		<%
			String bookId = request.getParameter("bookId");
			if(bookId != null)
			{
				Book p = bookManagementDAO.getBookById(bookId);
			
				if(p != null)
				{
		%>
			<tr>
				<td><%= p.getBookID()%></td>
			<td><%= p.getName()%></td>
			<td><%= p.getAuthor()%></td>
			<td><%= p.getCategory()%></td>
			<td><%= p.getDescription() %></td>
			<td><%= p.getNoOFUnits() %></td>
			<td><%= p.getSellingPrice()%></td>
			<td><%= p.getCostPrice()%></td>
			<td><%= p.getStatus()%></td>
				<td><button class="actionBtn" onclick="location.href = 'editBook.jsp?bookId=<%= p.getBookID()%>';">Edit</button></td>
				<td><button class="actionBtn" onclick="location.href = 'processDeleteBook.jsp?bookId=<%= p.getBookID()%>';">Delete</button></td>
			</tr>
	    <%		}
				else
				{
		%>
			<tr>
				<td colspan="5">No record to display</td>
			</tr>
		<% 
				}
			}
			else 
			{
		%>
			<tr>
				<td colspan="5">No record to display</td>
			</tr>
		<% 
			}
		%>
	</table>
</body>
</html>