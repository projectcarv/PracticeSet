package com.projectcarv.interface_set;

import java.util.List;

public class InterfaceMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface7 interfaceImpl = new Interface7Impl();
		List<Employee> employees= interfaceImpl.getAllEmployeeDetails();
		System.out.println(employees);
	}

}
