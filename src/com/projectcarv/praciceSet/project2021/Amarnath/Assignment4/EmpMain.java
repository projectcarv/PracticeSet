package com.projectcarv.praciceSet.project2021.Amarnath.Assignment4;

import java.util.List;

import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;
import com.projectcarv.praciceSet.project2021.Dharmendra.EmployeeBuilder;

public class EmpMain {

	public static void main(String[] args) {
EmployeeBuilder empBuilder = new EmployeeBuilder();
		
		List<Employee> empList = empBuilder.buildEmployees();
		System.out.println("The full name of the employees having employee code is :E002 are- ");	
		System.out.println("----------------------------------------------------------------");
		System.out.println("EmployeeName   ");
		System.out.println(".................");
		
		for (Employee emp : empList){
			if(emp.getEmployeeCode()=="E002"){
				System.out.println(emp.getEmployeeName());	
			}
		}
		System.out.println();
		System.out.println("The employees full name and full address where minimum salary is more than 50,000 are: ");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("EmployeeName                   "+"EmployeeAddress     ");
		System.out.println(".............                  "+"...............");
		for (Employee emp : empList){
			if(emp.getSalary()>50000){
				System.out.println(emp.getEmployeeName()+"            "+emp.getEmployeeAddress());
			}
		}
		System.out.println();
		System.out.println("The employee joining date and employee code if they belongs to Cuttack distirct are:- ");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("EmployeeCode   "+"JoinDate");
		System.out.println("............   "+".............");
		for (Employee emp : empList){
			if(emp.getEmployeeAddress().getDistrict()=="CUTTACK"){
				System.out.println(emp.getEmployeeCode()+"            "+emp.getJoinDate());
			}
		
		}

	}

}
