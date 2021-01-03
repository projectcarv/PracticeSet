package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much employee you want to add:- ");
		int input= sc.nextInt();
		try{
			new AddEmployee(input);
		}
		catch(ERST_COUNT_EMP | ERST_ATTR_EMP e){
			System.out.println(e.getMessage());
		}
	}
}
