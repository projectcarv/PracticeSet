package com.projectcarv.praciceSet.project2021.Amarnath.Assignment3;

import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;

public class DisplayEmp {
	public static void displayEmployee() {
		for (Employee emp : EmpData.employeeList) {
			System.out.println(emp.getEmployeeCode() + "   " + emp.getJoinDate() + " " + emp.getSalary() + " "
					+ emp.getEmployeeName() + " " + emp.getEmployeeAddress());
		}
		int size = EmpData.employeeList.size();
		System.out.println("Size of list = " + size);
	}

	public static void displayEmployee(int input) throws IndexException {
		for (Employee emp : EmpData.employeeList) {
			System.out.println(emp.getEmployeeCode() + "   " + emp.getEmployeeName() + " " + emp.getJoinDate() + "   "
					+ emp.getSalary() + " " + emp.getEmployeeAddress());
		}
		int size = EmpData.employeeList.size();
		System.out.println("Size of list = " + size);
		EmployeeRemoval.removeEmployee();
	}

	public static void empSameSalary() {

		for (Employee emp : EmpData.employeeList) {
			
		}
	}
}
