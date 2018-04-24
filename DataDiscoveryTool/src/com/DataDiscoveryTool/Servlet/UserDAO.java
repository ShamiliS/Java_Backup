package com.DataDiscoveryTool.Servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.DataDiscoveryTool.Connection.ConnectionManager;
import com.DataDiscoveryTool.beans.PatternBean;
import com.DataDiscoveryTool.beans.UserBean;

public class UserDAO {

	static Connection currentCon = null;
	static ResultSet rs = null;
	static ArrayList<String> tablename = new ArrayList<String>();

	public static ArrayList<String> login(HttpServletRequest request) {
		// preparing some objects for connection
		Statement stmt = null;

		UserBean ubean = new UserBean();

		String DB_Name = request.getParameter("dbname");
		ubean.setDBName(DB_Name);
		String Host_Name = request.getParameter("hostname");
		ubean.setHostName(Host_Name);
		Long Port_Number = Long.parseLong(request.getParameter("portnumber"));
		ubean.setPortNumber(Port_Number);
		String S_ID = request.getParameter("sid");
		ubean.setSID(S_ID);
		String U_Name = request.getParameter("uname");
		ubean.setUserName(U_Name);
		String Pass_Word = request.getParameter("pwd");
		ubean.setPassword(Pass_Word);
		String Schema_Val = request.getParameter("schema");
		ubean.setSchema(Schema_Val);

		String searchQuery = "SELECT table_name FROM all_tables where owner='" + U_Name + "'";

		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection(Host_Name, Port_Number, S_ID, U_Name, Pass_Word);
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();

			/*
			 * if user does not exist set the isValid variable to false
			 */
			if (!more) {
				System.out.println("Sorry, you are not a registered user! Please sign up first");
			}
			/*
			 * if user exists set the isValid variable to true
			 */
			else if (more) {
				tablename.clear();
				while (rs.next()) {
					tablename.add(rs.getString(1));
				}
			}
		}

		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		}

		// some exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return tablename;

	}

}
