package com.BiddingSystem;

public class BiddingFormMember {

	private String bidderName,Productname,BiddingPrice,email,address;

	public BiddingFormMember(String bidderName, String productname, String biddingPrice, String email, String address) {
		super();
		this.bidderName = bidderName;
		Productname = productname;
		BiddingPrice = biddingPrice;
		this.email = email;
		this.address = address;
	}

	public BiddingFormMember() {
		super();
	}

	public String getBidderName() {
		return bidderName;
	}

	public void setBidderName(String bidderName) {
		this.bidderName = bidderName;
	}

	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

	public String getBiddingPrice() {
		return BiddingPrice;
	}

	public void setBiddingPrice(String biddingPrice) {
		BiddingPrice = biddingPrice;
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
