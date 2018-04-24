package com.DataDiscoveryTool.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	static Connection con;

	public static Connection getConnection(String hostName, Long Port_No, String sid, String username,
			String password) {

		try {

			String url = "jdbc:oracle:thin:@" + hostName + ":" + Port_No + ":" + sid;
			// assuming "DataSource" is your DataSource name

			Class.forName("oracle.jdbc.driver.OracleDriver");

			try {
				con = DriverManager.getConnection(url, username, password);

			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return con;
	}

}
