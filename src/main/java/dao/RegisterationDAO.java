package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import dbconnection.dbConn;
import pojo.Registeration;

public class RegisterationDAO {
	public static int addNewUser(Registeration regDetails) {
		int status = 0;
		try {
			Connection conn = dbConn.getConnection();
			PreparedStatement ps= conn.prepareStatement("INSERT INTO Registeration VALUES(?,?,?)");
			ps.setString(1, regDetails.getEmail());
			ps.setString(2, regDetails.getUserName());
			ps.setString(3, regDetails.getPassword());
			status = ps.executeUpdate();
			PreparedStatement ps1= conn.prepareStatement("INSERT INTO logins VALUES(?,?)");
			ps1.setString(1, regDetails.getUserName());
			ps1.setString(2, regDetails.getPassword());
			status = ps1.executeUpdate();
			dbConn.closeConnection(conn);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
