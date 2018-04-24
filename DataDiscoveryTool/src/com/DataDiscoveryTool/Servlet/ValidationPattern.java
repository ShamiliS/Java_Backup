package com.DataDiscoveryTool.Servlet;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import com.DataDiscoveryTool.beans.PatternBean;
import com.DataDiscoveryTool.beans.UserBean;

public class ValidationPattern {

	static ArrayList<String> TableName;

	static String ColumnName, PII_Data;

	static HttpServletRequest request;

	static ConcurrentHashMap<String, String> output = new ConcurrentHashMap<String, String>();

	public static ConcurrentHashMap<String, String> validateCoulmn(String colName) {
		UserBean ubean = new UserBean();
		String getpID = PatternBean.getId();
		String getpName = PatternBean.getName();
		String getpAddress = PatternBean.getAddress();
		String getptelephone = PatternBean.getTelephone();
		String getpemail = PatternBean.getEmail();

		String sqlQurey = "select table_name from all_tab_columns where owner = '" + ubean.getUserName()
				+ "' and column_name='" + colName + "'";

		colName = colName.toLowerCase();

		if (Pattern.matches(getpID, colName)) {
			TableName = PatternDAO.patternInfo(sqlQurey.trim());
			output.clear();
			output.put("TableName", (TableName.get(0)).toString());
			output.put("ColumnName", colName);
			output.put("PII_Data", "ID");

		} else if (Pattern.matches(getpName, colName)) {
			TableName = PatternDAO.patternInfo(sqlQurey);
			output.clear();
			output.put("TableName", (TableName.get(0)).toString());
			output.put("ColumnName", colName);
			output.put("PII_Data", "Name");

		} else if (Pattern.matches(getpAddress, colName)) {
			TableName = PatternDAO.patternInfo(sqlQurey);
			output.clear();
			output.put("TableName", (TableName.get(0).toString()));
			output.put("ColumnName", colName);
			output.put("PII_Data", "Address");

		} else if (Pattern.matches(getptelephone, colName)) {
			output.clear();
			TableName = PatternDAO.patternInfo(sqlQurey);
			output.put("TableName", (TableName.get(0).toString()));
			output.put("ColumnName", colName);
			output.put("PII_Data", "Telephone");

		} else if (Pattern.matches(getpemail, colName)) {
			TableName = PatternDAO.patternInfo(sqlQurey);
			output.clear();
			output.put("TableName", TableName.get(0).toString());
			output.put("ColumnName", colName);
			output.put("PII_Data", "E-Mail");
		}
		return output;

	}

}
