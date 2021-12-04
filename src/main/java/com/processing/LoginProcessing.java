package com.processing;

import java.io.IOException;

import dao.LoginDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Login;

/**
 * Servlet implementation class LoginProcessing
 */
public class LoginProcessing extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;


    public LoginProcessing() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		Login log = new Login(userName, password);
		if(LoginDAO.isUserValid(log))
		{
			session.setAttribute("userName",userName);
			session.setMaxInactiveInterval(200); 
			response.sendRedirect("home.jsp"); 
		}
		else 
		{
			response.sendRedirect("loginFailed.jsp"); 
		}
		//doGet(request, response);
	}

}
