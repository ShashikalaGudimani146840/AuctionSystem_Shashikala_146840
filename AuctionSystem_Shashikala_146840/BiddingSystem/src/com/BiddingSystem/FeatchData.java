package com.BiddingSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


@WebServlet("/FeatchData")
public class FeatchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb1","root","admin");
			PreparedStatement ps=conn.prepareStatement("select * from addedItemList ORDER BY Productname DESC LIMIT 1;");
			ResultSet rs=ps.executeQuery();
			PrintWriter out=response.getWriter();
			out.println("<html><title><h1>Hello</h1></title></html>");
			out.println("<html><body><center><p><h1 style='color:blue'>Details Of The Items..!!.</h1></p><table border='1' style='width:100%'><tr style='background-color:Orange;'><td>ProductName</td><td>Price</td><td>Email</td><td>Address</td></tr>");
			while(rs.next())
			{
				out.println("<tr style='background-color:LightGray;'><td><a href='BiddingForm.jsp'>"+rs.getString(1)+"</a></td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
			}
			out.println("</table><center><table><tr></tr><tr></tr><tr></tr><tr></tr><tr style='background-color:DodgerBlue;'><td><input type='button' value='CloseBidding'></td><td></td><td><a href='WonBidder.jsp'><input type='button' value='BiddingWinner'></a></td></tr></table></center></center></body></html>");
		}catch(Exception e){
			
		}
		
	}

}
