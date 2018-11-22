package com.projectcarv.interface_set;

public class Address {
	
	private String aptName;
	private String city;
	private String state;
	private String country;
	private int zip;
	
	public Address(String aptName, String city, String state, String country, int zip   ) {
		this.aptName = aptName;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zip = zip;
		
	}
	public String getAptName() {
		return aptName;
	}
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String toString(){
		return "aptName: "+aptName+" city: "+city+" state: "+state+" country: "+country+" zip: "+zip;
	}

}
