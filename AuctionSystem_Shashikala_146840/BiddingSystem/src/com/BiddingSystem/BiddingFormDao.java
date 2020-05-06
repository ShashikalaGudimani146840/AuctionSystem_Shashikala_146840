package com.BiddingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BiddingFormDao {
	private String dburl="jdbc:mysql://localhost:3306/userdb1";
	private String dbuname="root";
	private String dbpassword="admin";
	private String dbdriver="com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbdriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con=null;
		try {
			loadDriver(dbdriver);
			con=DriverManager.getConnection(dburl,dbuname,dbpassword);
			if(con!=null) {
				System.out.println("Connection Created");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert(BiddingFormMember biddingmember)
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		System.out.println("My Conncetion is:" +con);
		String result="data entered successfully";
		String sql="insert into userdb1.biddingtable values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, biddingmember.getBidderName());
			ps.setString(2, biddingmember.getProductname());
			ps.setString(3,biddingmember.getBiddingPrice());
			ps.setString(4, biddingmember.getEmail());
			ps.setString(5,biddingmember.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
		}
		
		return result;
	}

}
