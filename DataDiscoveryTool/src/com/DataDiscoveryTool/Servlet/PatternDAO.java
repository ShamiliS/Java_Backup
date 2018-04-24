package com.DataDiscoveryTool.Servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.DataDiscoveryTool.Connection.ConnectionManager;
import com.DataDiscoveryTool.beans.PatternBean;
import com.DataDiscoveryTool.beans.UserBean;

public class PatternDAO {

	static Connection currentCon = null;
	static ResultSet rs = null;
	static ArrayList<String> tablename = new ArrayList<String>();

	public static ArrayList<String> patternInfo(String sqlquery) {
		// preparing some objects for connection
		Statement stmt = null;
		UserBean bean = new UserBean();

		String DB_Name = bean.getDBName();
		String Host_Name = bean.getHostName();
		Long Port_Number = bean.getPortNumber();
		String S_ID = bean.getSID();
		String U_Name = bean.getUserName();
		String Pass_Word = bean.getPassword();
		String Schema_Val = bean.getSchema();

		String searchQuery = sqlquery;

		try {

			currentCon = ConnectionManager.getConnection(Host_Name, Port_Number, S_ID, U_Name, Pass_Word);
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();
			tablename.clear();

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
				do {
					tablename.add(rs.getString(1));
				} while (rs.next());
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
