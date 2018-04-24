<%@ page import="java.util.ArrayList"%>
<%@ page import="com.DataDiscoveryTool.beans.UserBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View List of Tables</title>
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
	font-size: 20px;
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
</style>
</head>

<body background="images/database.jpg">
	<h2 align="center">Schema and List of Tables under it</h2>
	 
	<table class="a" align="center">
		<tr>
			<th>Tables</th>
		</tr>
		<%
			ArrayList<String> Tablename = UserBean.tableName;
			for (String name : Tablename) {
		%>
		<tr>
			<td><input type="lable" id="all_tables" class="label color"
				value="<%=name%>" target="frame1" /></td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>