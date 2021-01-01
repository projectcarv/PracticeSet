package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

public class Address {
	public static String area;
	public static String district;
	public static int zipcode;

	public Address() {
		super();
		
	}

	public Address(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return area + " " + district+ " " + zipcode ;
	}

}
