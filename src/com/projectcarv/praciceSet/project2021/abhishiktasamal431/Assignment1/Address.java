package com.projectcarv.praciceSet.project2021.abhishiktasamal431.Assignment1;

public class Address {
	private String area;
	private String district;
	private int zipCode;

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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return area + " " + district + " " + zipCode;
	}

}
