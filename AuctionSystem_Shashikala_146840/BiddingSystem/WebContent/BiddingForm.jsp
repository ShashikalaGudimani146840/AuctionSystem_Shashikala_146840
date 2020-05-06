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
<form action="BiddingForm" method="post">
<p><h1 style="color:blue">Please Bid For the Item</h1></p>
		<table style="background-color: Tomato">
			<tr>
				<td>BidderName</td>
				<td><input type="text" name="bidderName"></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="Productname"></td>
			</tr>
			<tr>
				<td>Bidding Price(Greater than Price):</td>
				<td><input type="text" name="BiddingPrice"></td>
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
			<td></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Bid"></td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>