<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="dao.bookManagementDAO"%>
<%@page import="pojo.Book"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<%@ include file="headerMenu.jsp" %>
	<%
		String bookId = request.getParameter("bookId");
		Book book = bookManagementDAO.getBookById(bookId);
		
	%>
	<div align="center">
		<form action="processEditBook" method="post">
			<table class="productTable">
				<thead>
					<tr>
						<th colspan="2">
							Product Details
						</th>
					</tr>
				</thead>
				<tr>
					<td>Product ID</td>
					<td><input type="text" name="bookId" size="20"
						value="<%=bookId%>" class="productTextField" readonly/></td>
				</tr>
				<tr>
					<td>Book Name</td>
					<td><input type="text" name="bookName" size="20"
						value="<%=book.getName()%>" class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Author</td>
					<td><input type="text" name="bookAuthor" size="20"
						value="<%=book.getAuthor()%>" class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><input type="text" name="bookCategory" size="20"
						value="<%=book.getCategory()%>" class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><input type="text" name="bookDescription" size="20"
						value="<%=book.getDescription()%>" class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Number of Units Available</td>
					<td><input type="text" name="bookNoOFUnits" size="20"
						value="<%=book.getNoOFUnits()%>" class="bookTextField" /></td>
				</tr>
				
				<tr>
					<td>Selling Price</td>
					<td><input type="text" name="bookSellingPrice" size="20"
						value="<%=book.getSellingPrice()%>" class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Cost Price</td>
					<td><input type="text" name="bookCostPrice" size="20"
						value="<%=book.getCostPrice()%>" class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Status</td>
					<td><input type="text" name="bookStatus" size="20"
						value="<%=book.getStatus()%>" class="bookTextField" /></td>
				</tr>
			</table>
			<button class="actionBtn" style="margin-top:10px">Save</button>
		</form>
	</div>
</body>
</html>