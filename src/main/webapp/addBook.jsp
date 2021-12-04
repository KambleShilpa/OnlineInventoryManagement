<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="dao.bookManagementDAO"%>
<%@page import="pojo.Book"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="headerMenu.jsp" %>

	<div align="center">
		<form action="processAddBook" method="post">
			<table class="bookTable">
				<thead>
					<tr>
						<th colspan="2">
							Book Details
						</th>
					</tr>
				</thead>
				<tr>
					<td>Book ID</td>
					<td><input type="text" name="bookId" size="20"
						class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Book Name</td>
					<td><input type="text" name="bookName" size="20"
						class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Author</td>
					<td><input type="text" name="bookAuthor" size="20"
						class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><input type="text" name="bookCategory" size="20"
						class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><input type="text" name="bookDescription" size="20"
						class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Number of Units Available</td>
					<td><input type="text" name="bookNoOFUnits" size="20"
						class="bookTextField" /></td>
				</tr>
				
				<tr>
					<td>Selling Price</td>
					<td><input type="text" name="bookSellingPrice" size="20"
						class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Cost Price</td>
					<td><input type="text" name="bookCostPrice" size="20"
						class="bookTextField" /></td>
				</tr>
				<tr>
					<td>Status</td>
					<td><input type="text" name="bookStatus" size="20"
						class="bookTextField" /></td>
				</tr>
			</table>
			<button class="actionBtn" style="margin-top:10px">Add</button>
		</form>
	</div>
</body>
</html>