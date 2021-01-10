package com.projectcarv.praciceSet.project2021.Dharmendra;

import java.util.List;

import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;

public class EmployeeBuilderTest {

	public static void main(String[] args) {
		
		EmployeeBuilder empBuilder = new EmployeeBuilder();
		
		List<Employee> empList = empBuilder.buildEmployees();
		
		for (Employee emp : empList){
			System.out.println(emp.getEmployeeName().getFirstName());
		
		}
	}

}
