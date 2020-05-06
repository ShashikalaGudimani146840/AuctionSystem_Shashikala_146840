<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="additemform" method="post">
	<p><h1 style="color:blue">Please Provide Information Of The Item..!!.</h1></p>
		<table style="background-color: DodgerBlue;height:50%;" border="2">
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="Productname"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="Price"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td></td>
				<td><center><input type="submit" value="Add"></center></td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>