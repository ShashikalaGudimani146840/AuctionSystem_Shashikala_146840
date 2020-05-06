package com.BiddingSystem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BiddingForm")
public class BiddingForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bidderName=request.getParameter("bidderName");
		String ProductName=request.getParameter("Productname");
		String BiddingPrice=request.getParameter("BiddingPrice");
		String Email=request.getParameter("email");
		String Address=request.getParameter("address");
		BiddingFormMember member=new BiddingFormMember(bidderName,ProductName,BiddingPrice,Email,Address);
		BiddingFormDao rdo=new BiddingFormDao();
		String result=rdo.insert(member);
		if(result=="data entered successfully")
		{
			response.sendRedirect("SucessfulBidding.jsp");
		}
		response.getWriter().print(result);
	}

}
