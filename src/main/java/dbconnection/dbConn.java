package dbconnection;

import java.sql.*;

public class dbConn {
	public static Connection getConnection() {
		Connection con = null;
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl = "jdbc:sqlserver://LAPTOP-B5T6U18J;database=bookInventory;IntegratedSecurity=true;";
			con = DriverManager.getConnection(connectionUrl);
			System.out.println("Connection esh");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(Connection con) throws SQLException {
		con.close();
		
	}
}
