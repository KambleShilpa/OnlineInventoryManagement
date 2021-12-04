<%@page import="dao.RegisterationDAO"%>
<%@page import="pojo.Registeration"%>

<%

String email = request.getParameter("email");
String userName = request.getParameter("userName");
String password = request.getParameter("password");

Registeration reg = new Registeration(email,userName,password);

int status = RegisterationDAO.addNewUser(reg);
if(status != 0)
{
	response.sendRedirect("login.jsp"); 
}
else
{
	response.sendRedirect("error.jsp"); 
}

%>