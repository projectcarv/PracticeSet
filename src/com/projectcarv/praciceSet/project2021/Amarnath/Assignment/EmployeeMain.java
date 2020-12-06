package Assignment;

import java.util.Scanner;
import Assignment.Employee;
import Assignment.DisplayEmployee;

public class EmployeeMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		Address address = new Address();
		System.out.println("Enter the number of Employee You want to add (Max 5 at a time)");
		int i = Integer.parseInt(sc.nextLine());
		int j = i;
		for (i = 1; i <= j; i++) {

			System.out.println("*****Enter Employee " + i + " Details******");
			System.out.println("Enter Employee name---");
			employee.employeeName = sc.nextLine();
			System.out.println("Enter Employee code---");
			employee.employeeCode = sc.nextLine();
			System.out.println("Enter Employee JoinDate---");
			employee.joinDate = sc.nextLine();
			System.out.println("Enter Employee Salary---");
			employee.salary = Integer.parseInt(sc.nextLine());

			System.out.println("*****Enter Employee Address*****");
			System.out.println("Enter Employee Area---");
			address.area = sc.nextLine();
			System.out.println("Enter Employee District---");
			address.district = sc.nextLine();
			System.out.println("Enter Employee ZipCode---");
			address.zipcode = Integer.parseInt(sc.nextLine());
		}
		System.out.println("How You want to view The Employee Details..");
		System.out.println("1. FullEmployeeDetails \n2. EmployeeName \n3. EmployeeCode");
		System.out.println("***Choose Your Option***");
		int choice = sc.nextInt();
		DisplayEmployee dEmployee = new DisplayEmployee();
		if (choice == 1) {
			dEmployee.displayEmployeeDetails(employee.employeeName, employee.employeeCode, employee.joinDate,
					employee.salary, address.area, address.district, address.zipcode);
		} else if (choice == 2) {
			dEmployee.displayEmployeeName(employee.employeeName);
		} else if (choice == 3) {
			dEmployee.displayEmployeeCode(employee.employeeCode);
		}

	}
}
