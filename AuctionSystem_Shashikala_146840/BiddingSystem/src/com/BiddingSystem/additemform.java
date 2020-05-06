package com.BiddingSystem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/additemform")
public class additemform extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public additemform() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ProductName=request.getParameter("Productname");
		String Price=request.getParameter("Price");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		Itemlistform item=new Itemlistform(ProductName,Price,email,address);
		AddItemformDao rdo=new AddItemformDao();
		String result=rdo.insert(item);
		if(result=="data entered successfully")
		{
			response.sendRedirect("getAllRecord.jsp");
		}
		response.getWriter().print(result);
	}

}
