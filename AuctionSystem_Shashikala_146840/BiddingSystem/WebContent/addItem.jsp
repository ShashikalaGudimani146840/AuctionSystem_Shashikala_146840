<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%
String navigation="Additemform.jsp";
%>
<center>
	<form action="AddItem">
	<p><h1 style="color:blue">Please Add Items For Bidding..!!!.</h1></p>
		<table>
			<tr>
				<td><input type="button" value="AddItems" onClick="JavaScript:window.location='<%= navigation %>';"></td>
				<td></td>
			</tr>
		</table>

	</form>
</center>
</body>
</html>



