package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

import java.util.Scanner;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment2.EmpCreation;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;

public class DisplayEmployee {
	/*
	 * public static void DisplayEmployee() { Scanner sc = new
	 * Scanner(System.in); System.out
	 * .println("Choose What you want to view : \n1: EmployeeName \n2: EmployeeCode \n3: EmployeeAllDetails "
	 * ); int choose = sc.nextInt(); if (choose == 1) {
	 * System.out.println("***Employess Name are***");
	 * System.out.println(" E Name         ");
	 * System.out.println("--------------------"); for (Employee emp :
	 * EmpCreation.employeeList) { System.out.println(emp.getEmployeeName()); }
	 * } else if (choose == 2) {
	 * System.out.println("***Employess EmpCodes are***");
	 * System.out.println(" EID"); System.out.println("------"); for (Employee
	 * emp : EmpCreation.employeeList) {
	 * System.out.println(emp.getEmployeeCode()); } } else if (choose == 3) {
	 * System.out.println("***Employess details are***");
	 * System.out.println("EID                 " +
	 * "       E NAME                  " + "    JOIN DATE                 " +
	 * "    SALARY                 " + "     ADDRESS"); System.out.println(
	 * "-----------------------------------------------------------------------------------------------------------------------------------------"
	 * );
	 * 
	 * for (Employee emp : EmpCreation.employeeList) { System.out.println(emp);
	 * } }
	 * 
	 * }
	 * 
	 */	public static void displayName() {
		System.out.println("***Employess Name are***");
		System.out.println(" E Name         ");
		System.out.println("--------------------");
		for (Employee emp : EmpCreation.employeeList) {
			System.out.println(emp.getEmployeeName());
		}
	}

	public static void displayId() {
		System.out.println("***Employess EmpCodes are***");
		System.out.println(" EID");
		System.out.println("------");
		for (Employee emp : EmpCreation.employeeList) {
			System.out.println(emp.getEmployeeCode());
		}
	}

	public static void displayAllDetails() {
		System.out.println("***Employess details are***");
		System.out.println("EID                 " + "       E NAME                  " + "    JOIN DATE                 "
				+ "    SALARY                 " + "     ADDRESS");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------");

		for (Employee emp : EmpCreation.employeeList) {
			System.out.println(emp);
		}
	}
}
