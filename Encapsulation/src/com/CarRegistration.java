package com;

public class CarRegistration {
	private int regNo;
	String ownerName;
	String companyName;
	

	public int getRegNo() {
		return regNo;
	}


	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void display(){
		System.out.println("registration number of car is :"+regNo);
		System.out.println("owner name of car is :"+ownerName);
		System.out.println("company of car is :"+companyName);
		System.out.println("---------------------------------");
	}

	
	

}
