package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Address;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Name;

public class EmpCreation {
	public static List<Employee> employeeList = new ArrayList<Employee>();

	public static void empCreation(int value) {
		Scanner sc = new Scanner(System.in);
		List<Name> nameList = new ArrayList<Name>();
		List<Address> addressList = new ArrayList<Address>();
		for (int i = 0; i < value; i++) {

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
			nameList.add(ename);

			Address eaddress = new Address();
			System.out.print("What is " + (i + 1) + " Employess Area name?");
			String area = sc.next();

			System.out.print("What is " + (i + 1) + " Employess District name?");
			String district = sc.next();

			System.out.print("What is " + (i + 1) + " Employess Zipcode?");
			int zipcode = sc.nextInt();
			eaddress.setArea(area);
			eaddress.setDistrict(district);
			eaddress.setZipcode(zipcode);

			addressList.add(eaddress);

			Employee emp = new Employee();
			System.out.print("What is " + (i + 1) + " Employee Code?");
			String empCode = sc.next();

			System.out.print("What is " + (i + 1) + " Employee Join Date?");
			String empJdate = sc.next();

			System.out.print("What is " + (i + 1) + " Employee Salary?");
			int empSalary = sc.nextInt();
			emp.setEmployeeCode(empCode);
			emp.setJoinDate(empJdate);
			emp.setSalary(empSalary);
			emp.setEmployeeName(ename);
			emp.setEmployeeAddress(eaddress);

			employeeList.add(emp);
		}

	}
}
