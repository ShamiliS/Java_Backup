package com.DataDiscoveryTool.beans;

import java.util.ArrayList;

public class UserBean {

	private static String DBName;
	private static String HostName;
	private static Long PortNumber;
	private static String SID;
	private static String UserName;
	private static String Password;
	private static String Schema;
	public boolean valid;
	public static ArrayList<String> tableName, Columnname_sql;

	public UserBean() {
	}

	public String getDBName() {
		return DBName;
	}

	public void setDBName(String dBName) {
		this.DBName = dBName;
	}

	public String getHostName() {
		return HostName;
	}

	public void setHostName(String hostName) {
		this.HostName = hostName;
	}

	public Long getPortNumber() {
		return PortNumber;
	}

	public void setPortNumber(Long portNumber) {
		this.PortNumber = portNumber;
	}

	public String getSID() {
		return SID;
	}

	public void setSID(String sID) {
		this.SID = sID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public String getSchema() {
		return Schema;
	}

	public void setSchema(String schema) {
		this.Schema = schema;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean newValid) {
		valid = newValid;
	}

	public static void setTable(ArrayList<String> table) {
		tableName = table;
	}

	public static void setColumnName(ArrayList<String> information) {
		Columnname_sql = information;
	}

}
