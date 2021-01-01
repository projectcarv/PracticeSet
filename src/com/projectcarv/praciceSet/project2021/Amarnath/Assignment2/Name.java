package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

public class Name {
	public String FirstName;
	public String MiddleName;
	public String LastName;

	public Name() {
		super();
		
	}
	public Name(String string, String string2, String string3) {
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
