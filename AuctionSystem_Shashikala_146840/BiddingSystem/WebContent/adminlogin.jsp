<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<%
String navigation="addItem.jsp";
%>
<center>
	<form action="Register" method="post" >
	<p><h1 style="color:blue">Welcome To User Login..!!.</h1></p>
	<p></p>
		<table>
			<tr>
				<td>User name:</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><center><input type="submit" value="login" onClick="JavaScript:window.location='<%= navigation %>';"></center></td>
			</tr>
		</table>


	</form>
</center>
</body>
</html>