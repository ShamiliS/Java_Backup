<%@ page import="java.util.*"%>
<%@ page import="java.util.Map.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.DataDiscoveryTool.beans.UserBean"%>
<%@ page import="com.DataDiscoveryTool.Servlet.ValidationPattern"%>
<%@ page import="com.DataDiscoveryTool.Servlet.Patternmatch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Schema Result</title>
<style>
table {
	border-collapse: collapse;
	border: 1px solid black;
}

.label {
	color: white;
	padding: 8px;
	font-family: Arial;
}

.color {
	background-color: #438e49;
	color: black;
}

th, td {
	border: 1px solid black;
}

th {
	background-color: #4CAF50;
	color: black;
	padding: 10px;
	font-size: 16px;
}

table.a {
	table-layout: auto;
	width: 180px;
}

table.b {
	table-layout: fixed;
	width: 180px;
}

table.c {
	table-layout: auto;
	width: 100%;
}

table.d {
	table-layout: fixed;
	width: 100%;
}

h2 {
	color: white;
}
</Style>
</head>
<body background="images/result.jpg">
	<table class="a" align="center">
		<tr>
			<th>Table_Name</th>
			<th>Column_Name</th>
			<th>PII Data Found</th>
		</tr>
		<%
			Patternmatch obj = new Patternmatch();//Creating class Object
			obj.PatternmatchfromDB();//Calling add Method
		%>
	</table>
</body>
</html>