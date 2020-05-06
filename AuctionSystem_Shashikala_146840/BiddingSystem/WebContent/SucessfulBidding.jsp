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
String navigation="getAllRecord.jsp";
%>
<center>
<form action="SucessfulBidding" method="post">
<p><h1 style="color:blue">Sucessfully Bidding..!!.</h1></p>
<input type="button" value="Bid Again" onClick="JavaScript:window.location='<%= navigation %>';">

</form>
</center>

</body>
</html>