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
String mypage="adminlogin.jsp";
String bidderpage="WelComeBidder.jsp";
%>
<center>
	<form action="Register">
	<p><h1 style="color:blue">Welcome To Auction System.</h1></p>
		<table>
			<tr style="color:blue">
				<td><input type="button" value="User" onClick="JavaScript:window.location='<%= mypage %>';"></td>
				<td><input type="button" value="Bidder" onClick="JavaScript:window.location='<%= bidderpage %>';"></td>
			</tr>
		</table>

	</form>
</center>
</body>
</html>



