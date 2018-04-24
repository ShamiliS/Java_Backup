<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Discovery Tool-Home Page</title>
<style>
table {
	border-style: solid;
	width: 50%;
}

.label {
	color: white;
	padding: 8px;
	font-family: Arial;
}

.color {
	background-color: powderblue;
}

td {
	
}

input[type=text] {
	width: 100%;
	padding: 8px 15px;
	margin: 0px 3;
	display: inline-block;
	border: 1px solid;
	border-radius: 0px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 30%;
	background-color: #4CAF50;
	color: white;
	padding: 8px 15px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}
</style>
</head>
<body background="images/Data.jpg">
	<h2 align="center" style="color: white">Data Discovery Tool</h2>
	 
	<form action="RetrieveData" method="post">
		<table align="center" bgcolor="#919bbc">
			<tr>
				<th colspan="10" align="center" height="35">DataBase Details</th>
			</tr>
			<tr>
				<td>DB Name</td>
				<td><input type="text" name="dbname" maxlength="35" size="35"></td>
			</tr>
			<tr>
				<td>Host Name</td>
				<td><input type="text" name="hostname"></td>
			</tr>
			<tr>
				<td>Port Number</td>
				<td><input type="text" name="portnumber"></td>
			</tr>
			<tr>
				<td>SID</td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="pwd"></td>
			</tr>
			<tr>
				<td>Schema</td>
				<td><input type="text" name="schema"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Connect"></td>
			</tr>
		</table>
	</form>

</body>
</html>