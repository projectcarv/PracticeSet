package com.projectcarv.praciceSet.project2021.abhishiktasamal431.Assignment1;

public class Employee {
	private Name EmployeeName;
	private String EmployeeId;
	private int EmployeeSalary;
	private String EmployeeJoinDate;
	private Address EmployeeAddress;

	public Name getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(Name employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public int getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	public String getEmployeeJoinDate() {
		return EmployeeJoinDate;
	}

	public void setEmployeeJoinDate(String employeeJoinDate) {
		EmployeeJoinDate = employeeJoinDate;
	}

	public Address getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return EmployeeId + "   " + EmployeeName + "       " + EmployeeSalary + "      " + EmployeeJoinDate + "    " + EmployeeAddress;
	}

}
