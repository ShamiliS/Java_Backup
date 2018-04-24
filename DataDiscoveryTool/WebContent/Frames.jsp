
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.DataDiscoveryTool.Servlet.RetrieveDataServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Frameset</title>
<style>
frameset {
	bordercolor: #00ff00;
	frameborder: no;
	border: 25;
	scrolling: no;
	noresize: noresize;
}
</style>
</head>

<frameset cols="40%, *">
	<frame name="Frame1" noresize src="ListofTable.jsp" />
	<frame name="Frame2" noresize src="Patterns.jsp" />
</frameset>
</html>