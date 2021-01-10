package com.projectcarv.praciceSet.project2021.Amarnath.Assignment3;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmpData.generateEmployee();
		
		System.out.println("How you want to view the list : \n1: All Details \n2: Who's salary are same");
		int option=sc.nextInt();
		if(option==1){
			DisplayEmp.displayEmployee();
		}else if(option==2){
			DisplayEmp.empSameSalary();
		}
		try {
			EmployeeRemoval.removeEmployee();
		} catch (IndexException e) {
			System.out.print(e.getMessage());
		}
	}

}
