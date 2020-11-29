package com.projectcarv.praciceSet.project2021.UserAnalysis;

public class User {
	
	private String name;
	private String address;
	private String zipCode;
	private String joinedDate;
	
	
	public User(String name, String address, String zipCode, String joinedDate) {
		super();
		this.name = name;
		this.address = address;
		this.zipCode = zipCode;
		this.joinedDate = joinedDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}

	@Override
	public String toString() {
		return "User [name=" + name ;
	}
	
	
	
	
}
