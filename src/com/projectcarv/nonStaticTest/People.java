package com.projectcarv.nonStaticTest;

public class People {
	
	int id;
	String name;
	
	{
		System.out.println("People non static block");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
