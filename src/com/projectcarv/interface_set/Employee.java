package com.projectcarv.interface_set;

public class Employee {
	
	private String name;
	private Address address;
	private String employeeId;
	
	public Employee(String name, Address address, String employeeId){
		
		this.name = name;
		this.address = address;
		this.employeeId = employeeId;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String toString(){
		return "  Employee Name: "+name+";Employee address: {"+address+"};Employee id: "+employeeId+"\n";
	}

	

}
