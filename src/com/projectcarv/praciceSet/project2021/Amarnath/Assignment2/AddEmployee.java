package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Address;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Name;

public class AddEmployee {
	public AddEmployee(int input) throws ERST_COUNT_EMP, ERST_ATTR_EMP {
		if (input >= 5) {
			throw new ERST_COUNT_EMP("No of employees should be less than 5  You are trying to added :" + input);
		} else {
			Scanner sc = new Scanner(System.in);
			List<Employee> employeeList = new ArrayList<Employee>();
			List<Name> nameList = new ArrayList<Name>();
			List<Address> addressList = new ArrayList<Address>();
			for (int i = 0; i < input; i++) {

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
			// System.out.println(employeeList);
			System.out.println(
					"Choose What you want to view : \n1: EmployeeName \n2: EmployeeCode \n3: EmployeeAllDetails \n4: Manager name of Employee");
			int choose = sc.nextInt();
			if (choose == 1) {
				System.out.println("***Employess Name are***");
				System.out.println(" E Name         ");
				System.out.println("--------------------");
				for (Employee emp : employeeList) {
					System.out.println(emp.getEmployeeName());
				}
			} else if (choose == 2) {
				System.out.println("***Employess EmpCodes are***");
				System.out.println(" EID");
				System.out.println("------");
				for (Employee emp : employeeList) {
					System.out.println(emp.getEmployeeCode());
				}
			} else if(choose==3){
				System.out.println("***Employess details are***");
				System.out.println("EID                 "+"       E NAME                  "+"    JOIN DATE                 "+"    SALARY                 "+"     ADDRESS");
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
				
				for (Employee emp : employeeList) {
					System.out.println(emp);
				}
			}else if(choose==4){
				throw new ERST_ATTR_EMP("This {attribute} is not present in Employee");
			}
		}

	}
}
