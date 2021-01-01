package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment2.Address;
public class Employee {
	public Name employeeName;
	public String employeeCode;
	public String joinDate;
	public int salary;
	public Address employeeAddress;
	public Employee() {
		super();
		
	}
	public Employee(Name name, String string, String string2, int i, Address address) {
		// TODO Auto-generated constructor stub
	}
	public Name getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(Name employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	@Override
	public String toString() {
		return employeeCode+ "                  " +employeeName+ "                  " +joinDate + "                  " + salary + "                  " + employeeAddress ;
	}
	
}
