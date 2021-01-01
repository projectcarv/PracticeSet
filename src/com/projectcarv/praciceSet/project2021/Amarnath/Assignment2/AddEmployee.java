package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddEmployee {
	public void addEmployee(int num) throws ERST_COUNT_EMP {
		if (num >= 5) {
			throw new ERST_COUNT_EMP("No of employees should be less than 5");
		} else {
			ArrayList<Employee> employee = new ArrayList<Employee>();
			Scanner sc = new Scanner(System.in);
			try {
				FileWriter myWriter = new FileWriter("D:\\Employee.txt");
			
			for (int i = 0; i < num; i++) {
				
				Name ename = new Name();
				System.out.print("What is " + (i + 1) + " Employess First name?");
				String firstName = sc.next();

				System.out.print("What is " + (i + 1) + " Employess Middle name?");
				String middleName = sc.next();

				System.out.print("What is " + (i + 1) + " Employess Last name?");
				String lastName = sc.next();
				ename.setFirstName(firstName);
				ename.setMiddleName(middleName);
				ename.setLastName(lastName);
				
				Address eaddress= new Address();
				System.out.print("What is " + (i + 1) + " Employess Area name?");
				String area = sc.next();

				System.out.print("What is " + (i + 1) + " Employess District name?");
				String district = sc.next();

				System.out.print("What is " + (i + 1) + " Employess Zipcode?");
				int zipcode = sc.nextInt();
				eaddress.setArea(area);
				eaddress.setDistrict(district);
				eaddress.setZipcode(zipcode);
				
				Employee emp= new Employee();
				System.out.print("What is " + (i + 1) + " Employee Code?");
				String empCode = sc.next();

				System.out.print("What is " + (i + 1) + " Employee Join Date?");
				String empJdate = sc.next();

				System.out.print("What is " + (i + 1) + " Employee Salary?");
				int empSalary = sc.nextInt();
				emp.setEmployeeCode(empCode);
				emp.setJoinDate(empJdate);
				emp.setSalary(empSalary);
				
				myWriter.write(firstName);
				myWriter.write(middleName);
				myWriter.write(lastName);
				myWriter.write(empCode);
				myWriter.write(empJdate);
				myWriter.write(empSalary);
				myWriter.write(area);
				myWriter.write(district);
				myWriter.write(zipcode);
				System.out.println("File has wirtten....");
				System.out.println("\nEmployee "+(i + 1)+ " added Successfuly!!!");
				myWriter.close();
				
				
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
