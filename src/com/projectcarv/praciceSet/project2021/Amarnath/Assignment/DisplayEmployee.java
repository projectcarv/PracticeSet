package com.projectcarv.praciceSet.project2021.Amarnath.Assignment;

import java.util.ArrayList;
import java.util.List;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.*;

public class DisplayEmployee {
	void displayEmployeeName(Employee employee1, Employee employee2, Employee employee3, Employee employee4,
			Employee employee5) {
		System.out.println("***Employess Name are***");
		System.out.println(employee1.getEmployeeName());
		System.out.println(employee2.getEmployeeName());
		System.out.println(employee3.getEmployeeName());
		System.out.println(employee4.getEmployeeName());
		System.out.println(employee5.getEmployeeName());

	}

	void displayEmployeeCode(Employee employee1, Employee employee2, Employee employee3, Employee employee4,
			Employee employee5) {
		System.out.println("***Employess EmpCodes are***");
		System.out.println(employee1.getEmployeeCode());
		System.out.println(employee2.getEmployeeCode());
		System.out.println(employee3.getEmployeeCode());
		System.out.println(employee4.getEmployeeCode());
		System.out.println(employee5.getEmployeeCode());

	}

	public void displayEmployeeDetails(Employee employee1, Employee employee2, Employee employee3, Employee employee4,
			Employee employee5) {
		System.out.println("***Employess details are***");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
	}
}
