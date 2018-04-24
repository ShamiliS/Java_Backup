<%@ page import="java.util.ArrayList"%>
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
	padding: 12px;
	font-family: Arial;
}

.color {
	background-color: #438e49;
	color: black;
}

td {
	background-color: #438e49;
	color: black;
	padding: 10px;
	font-size: 18px;
}

th {
	background-color: #4CAF50;
	color: black;
	padding: 10px;
	font-size: 22px;
}

table.a {
	table-layout: auto;
	width: 180px;
}

table.d {
	table-layout: fixed;
	width: 100%;
}

h2 {
	color: white;
}

input[type=text] {
	width: 200px;
	height: 30px;
	display: block;
	border: 1px solid;
	box-sizing: border-box;
}

input[type=submit] {
	width: 30%;
	padding: 8px 15px;
	margin: 8px 0;
	border-radius: 4px;
	background-color: #525987;
	color: white;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #4551a0;
}
</style>
</head>
<body background="images/database.jpg">
	<h2 align="center">Patterns to look for</h2>
	<form action="RetrievePatternData" method="post">
		<table class="a" align="center">
			<br>
			<tr>
				<th colspan="8" align="center">Input Patterns</th>
			</tr>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>Telephone</td>
				<td><input type="text" name="telephone"></td>
			</tr>
			<tr>
				<td>E-Mail</td>
				<td><input type="text" name="email"></td>
			</tr>
		</table>
		<br> <input type="submit" value="Run Profiling" />
	</form>
</body>
</html>