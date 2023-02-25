package com.hrdsof.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataBaseUtility {
	private static String url;
	private static String driverName;
	private static String username;
	private static String password;
	
	static {
		ResourceBundle rb = ResourceBundle.getBundle("dbDetails");
		
		url = rb.getString("url");
		driverName = rb.getString("driver");
		username = rb.getString("user");
		password = rb.getString("pass");
	}
	
	public static Connection provideConnection() {
		Connection conn = null;
		
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
