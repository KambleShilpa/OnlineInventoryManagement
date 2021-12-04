package dao;

import java.util.*;
import java.sql.*;
import dbconnection.dbConn;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;
import pojo.Book;
import pojo.Registeration;

public class bookManagementDAO {
	public static String userName = "";
	public static List<Book> getAllBooks()
	{
		List<Book> bookList = new ArrayList<Book>();
		
		try
		{
			Connection conn = dbConn.getConnection();
			Statement st= conn.createStatement();
			ResultSet rs= st.executeQuery("SELECT * FROM BooksInventory where userName");
			while(rs.next())
			{
				Book book = new Book(rs.getString("bookID"),rs.getString("name"),
						rs.getString("author"), rs.getString("category"),
						rs.getString("description"), rs.getInt("NoOFUnits"),
						rs.getInt("sellingPrice"), rs.getInt("costPrice"),
						rs.getString("status"),rs.getString("userName"));
				bookList.add(book);
			}
			
			dbConn.closeConnection(conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return bookList;
	}
	
	public static Book getBookById(String bookId)
	{
		Book book = null;
		try
		{
			Connection conn = dbConn.getConnection();
			PreparedStatement ps= conn.prepareStatement("SELECT * FROM BooksInventory WHERE bookID = ?");
			ps.setString(1, bookId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				book = new Book(rs.getString("bookID"),rs.getString("name"),
						rs.getString("author"), rs.getString("category"),
						rs.getString("description"), rs.getInt("NoOFUnits"),
						rs.getInt("sellingPrice"), rs.getInt("costPrice"),
						rs.getString("status"),rs.getString("userName"));
				userName = rs.getString("userName");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return book;
	}
	
	
	public static int addBook(Book book)
	{
		int status = 0;
		try
		{
			Connection conn = dbConn.getConnection();
			PreparedStatement ps= conn.prepareStatement("INSERT INTO BooksInventory VALUES(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, book.getBookID());
			ps.setString(2, book.getName());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getCategory());
			ps.setString(5, book.getDescription());
			ps.setInt(6, book.getNoOFUnits());
			ps.setInt(7, book.getSellingPrice());
			ps.setInt(8, book.getCostPrice());
			ps.setString(9, book.getStatus());
			ps.setString(10, book.getUserName());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public static int updateBook(Book book)
	{
		int status = 0;
		try
		{
			Connection conn = dbConn.getConnection();
			PreparedStatement ps= conn.prepareStatement("UPDATE BooksInventory SET bookID=?, name=?, author=?, category=?, description=?, NoOFUnits=?, sellingPrice=?, costPrice=?, Status=?, userName=? WHERE bookID=?");
			ps.setString(1, book.getBookID());
			ps.setString(2, book.getName());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getCategory());
			ps.setString(5, book.getDescription());
			ps.setInt(6, book.getNoOFUnits());
			ps.setInt(7, book.getSellingPrice());
			ps.setInt(8, book.getCostPrice());
			ps.setString(9, book.getStatus());
			ps.setString(10, userName);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public static int deleteBook(String bookId)
	{
		int status = 0;
		try
		{
			Connection conn = dbConn.getConnection();
			PreparedStatement ps= conn.prepareStatement("DELETE FROM BooksInventory where bookID = ?");
			ps.setString(1, bookId);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

}
