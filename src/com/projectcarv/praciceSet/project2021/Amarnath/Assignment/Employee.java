package com.projectcarv.praciceSet.project2021.Amarnath.Assignment;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Address;
public class Employee {
	Name employeeName;
	String employeeCode;
	String joinDate;
	int salary;
	Address employeeAddress;
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
