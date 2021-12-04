package dao;

import java.sql.*;

import pojo.Login;
import dbconnection.*;

public class LoginDAO {
	public static boolean isUserValid(Login loginDetails) {
		boolean status = false;
		try {
			Connection con = dbConn.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from logins where username = '" + loginDetails.getUserName() + "' and password = '"+ loginDetails.getPassword()+"'");
			while(rs.next()) {
				status = true;
			}
			//dbConn.closeConnection(con);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
