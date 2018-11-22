package com.projectcarv.interface_set;

import java.util.ArrayList;
import java.util.List;

public class Interface7Impl implements Interface7{

	@Override
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> employeeList = new ArrayList<Employee>();
		Address add01 = new Address("Apt01","BBSR","ODISHA","INDIA",7543001);
		Employee emp01 = new Employee("employee1",add01,"empid01");
		
		Address add02 = new Address("Apt02","CTC","ODISHA","INDIA",7543002);
		Employee emp02 = new Employee("employee2",add02,"empid02");
		
		Address add03 = new Address("Apt03","KENDRAPARA","ODISHA","INDIA",7543003);
		Employee emp03 = new Employee("employee3",add03,"empid03");
		
		employeeList.add(emp01);
		employeeList.add(emp02);
		employeeList.add(emp03);
		return employeeList;
		
	}
	
	

}
