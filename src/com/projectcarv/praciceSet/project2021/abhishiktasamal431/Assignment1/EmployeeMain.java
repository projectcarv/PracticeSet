package com.projectcarv.praciceSet.project2021.abhishiktasamal431.Assignment1;

import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeCreater employeeCreater = new EmployeeCreater();
		List<Employee> empList = employeeCreater.createEmployess();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter How you wnat to view Employee \n1: Employee Id & Address \n2: Employee FirstName & ZipCode \n3: EmployeeAllDetails ");
		int input = sc.nextInt();
		if (input == 1) {
			System.out.println("EID   " + "          EADDRESS");
			System.out.println("------" + "    ---------------");
			for (Employee emp : empList) {
				System.out.println(emp.getEmployeeId() +"                  "+ emp.getEmployeeAddress());
			}
		} else if (input == 2) {
			System.out.println("Employee FirstName   " + "          Employee Zipcode");
			System.out.println("---------------------" + "           ---------------");
			for (Employee emp : empList) {
				System.out.println(emp.getEmployeeName().getFirstName() + "            "+emp.getEmployeeAddress().getZipCode());
			}
		} else if (input == 3) {
			System.out
					.println("EID   " + "  ENAME           " + "  ESALARY    " + " EJOINDATE  " + "          EADDRESS");
			System.out.println(
					"------" + "--------------    " + "----------   " + " ---------- " + "    ---------------");
			for (Employee emp : empList) {
				System.out.println(emp);
			}
		}
	}

}
