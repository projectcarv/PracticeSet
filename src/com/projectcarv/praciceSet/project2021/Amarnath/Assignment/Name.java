package com.projectcarv.praciceSet.project2021.Amarnath.Assignment;

public class Name {
	String FirstName;
	String MiddleName;
	String LastName;
	public Name() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return  FirstName+ " " + MiddleName + " " + LastName ;
	}
}
