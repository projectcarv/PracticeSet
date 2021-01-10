package com.projectcarv.praciceSet.project2021.Amarnath.Assignment3;

import java.util.Scanner;

public class EmployeeRemoval {
	public static void removeEmployee() throws IndexException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Index Numer which you want to remove");
		int input=sc.nextInt();
		if(input<EmpData.employeeList.size()){
		EmpData.employeeList.remove(EmpData.employeeList.get(input));
		DisplayEmp.displayEmployee(input);
		}else{
			throw new IndexException("index not present");
		}
	}

}
