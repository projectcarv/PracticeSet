package com.projectcarv.praciceSet.project2021.Amarnath.Assignment;

public class Address {
	String area;
	String district;
	int zipcode;

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
