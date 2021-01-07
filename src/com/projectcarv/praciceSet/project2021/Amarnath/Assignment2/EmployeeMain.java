package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String args[]) throws EmployeeAttributeException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much employee you want to add:- ");
		int input = sc.nextInt();
		try {
			EmployeeValidation.EmployeeValidation(input);
			System.out.println("Which attribute you want to view of Employee--");
			String found = sc.next();
			EmployeeValidation.ManagerFound(found);
		} catch (EmployeeCountException e) {
			System.out.println(e.getMessage());
		} catch (EmployeeAttributeException e) {
			System.out.println(e.getMessage());
		}
	}
}
