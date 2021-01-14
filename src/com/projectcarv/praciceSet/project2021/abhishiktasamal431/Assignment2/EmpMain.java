package com.projectcarv.praciceSet.project2021.abhishiktasamal431.Assignment2;

import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employee you want to generate...: ");
		int input = sc.nextInt();
		try {
			EmpValidate.empValidate(input);
			System.out.println("Which attribute you want see for employee: ");
			String input1=sc.next();
			EmpValidate.foundManager(input1);
			
		} catch (CountException e) {
			System.out.println(e.getMessage());
		}catch (EmployeeAttributeException e) {
			System.out.println(e.getMessage());
		}

	}

}
