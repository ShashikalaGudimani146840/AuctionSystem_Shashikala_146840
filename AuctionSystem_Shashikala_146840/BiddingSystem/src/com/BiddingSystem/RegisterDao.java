package com.BiddingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class RegisterDao {
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
	
	public String insert(member member)
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		System.out.println("My Conncetion is:" +con);
		String result="data entered successfully";
		String sql="insert into userdb1.member values(?,?)";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getUname());
			ps.setString(2, member.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
		}
		
		return result;
	}
	

}
