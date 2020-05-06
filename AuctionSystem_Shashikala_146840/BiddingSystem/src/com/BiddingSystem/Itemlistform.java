package com.BiddingSystem;

public class Itemlistform {
	private String Productname,Price,email,address;

	public Itemlistform(String productname, String price, String email, String address) {
		super();
		Productname = productname;
		Price = price;
		this.email = email;
		this.address = address;
	}

	public Itemlistform() {
		super();
	}

	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
