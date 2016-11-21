package org.kwok.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String URL = "jdbc:mysql://......";
	private static final String USERNAME = "...";
	private static final String PASSWORD = "...";
	private static Connection conn;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return conn;
	}	
}
