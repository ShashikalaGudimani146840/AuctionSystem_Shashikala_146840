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

@WebServlet("/WonBidder")
public class WonBidder extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb1","root","admin");
			PreparedStatement ps=conn.prepareStatement("select * from biddingtable where BiddingPrice=(select MAX(BiddingPrice) from biddingtable);");
			ResultSet rs=ps.executeQuery();
			PrintWriter out=response.getWriter();		
			while(rs.next())
			{
				String BidderName = rs.getString(1);
		        String BiddingPrice = rs.getString (3);
		        System.out.println("Bidder Name  is:"+BidderName);
		        System.out.println("Bidder Price  is:"+BiddingPrice);
		      
		        out.println("<html><body><center><p><h1 style='color:blue'>Congratulations The Winner is "+BidderName+" amount is:"+BiddingPrice+"..!!</h1></p></center></body></html>");
				
			}
			
		}catch(Exception e){
			
		}
	}

}
