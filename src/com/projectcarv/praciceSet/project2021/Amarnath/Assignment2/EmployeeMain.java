package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String args[]) throws ERST_COUNT_EMP {
		
		EmployeeData empData = new EmployeeData();
		//List<Employee> employess = empData.generateEmployee();
		Scanner sc = new Scanner(System.in);
		DisplayEmployee displayEmp = new DisplayEmployee();
		System.out.println("Enter how much employee you want to add:- ");
		int empNo= sc.nextInt();
		AddEmployee addEmp=new AddEmployee();
		addEmp.addEmployee(empNo);
		//System.out.println("Choose What you want to view : \n1: EmployeeName \n2: EmployeeCode \n3: EmployeeAllDetails");
		//int input = sc.nextInt();
		/*if (input == 1) {
			displayEmp.displayEmployeeName(Employee.get(0), employess.get(1), employess.get(2), employess.get(3), employess.get(4));
		} else if (input == 2) {
			displayEmp.displayEmployeeCode(employess.get(0), employess.get(1), employess.get(2), employess.get(3), employess.get(4));
		} else if (input == 3) {
			displayEmp.displayEmployeeDetails(employess.get(0), employess.get(1), employess.get(2), employess.get(3), employess.get(4));
		}*/
	}
}
