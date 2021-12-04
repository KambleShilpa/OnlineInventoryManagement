package com.processing;

import java.io.IOException;

import dao.bookManagementDAO;
import pojo.Book;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class processAddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public processAddBook() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookId = request.getParameter("bookId");
		String bookName = request.getParameter("bookName");
		String bookAuthor = request.getParameter("bookAuthor");
		String bookCategory = request.getParameter("bookCategory");
		String bookDescription = request.getParameter("bookDescription");
		String bookStatus = request.getParameter("bookStatus");
		HttpSession session = request.getSession();
		String bookUserName = (String) session.getAttribute("userName");
		Integer bookNoOFUnits = Integer.parseInt(request.getParameter("bookNoOFUnits"));
		Integer bookSellingPrice = Integer.parseInt(request.getParameter("bookSellingPrice"));
		Integer bookCostPrice = Integer.parseInt(request.getParameter("bookCostPrice"));

		Book book = new Book(bookId,bookName,bookAuthor,bookCategory,bookDescription,bookNoOFUnits,bookSellingPrice, bookCostPrice, bookStatus, bookUserName);

		int status = bookManagementDAO.addBook(book);
		if(status == 1)
		{
			response.sendRedirect("viewBooks.jsp"); 
		}
		else
		{
			response.sendRedirect("error.jsp"); 
		}
	}

}
