<%@page import="dao.bookManagementDAO"%>
<%@page import="pojo.Book"%>

<%

String bookId = request.getParameter("bookId");

int status = bookManagementDAO.deleteBook(bookId);
if(status == 1)
{
	response.sendRedirect("viewBooks.jsp"); 
}
else
{
	response.sendRedirect("error.jsp"); 
}

%>