package com.projectcarv.praciceSet.project2021.Amarnath.Assignment3;

import java.util.ArrayList;
import java.util.List;

import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Address;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Name;

public class EmpData {
	public static List<Employee> employeeList = new ArrayList<Employee>();

	public static List<Employee> generateEmployee() {
		Name ename1 = new Name();
		ename1.setFirstName("Amarnath");
		ename1.setMiddleName("");
		ename1.setLastName("Behera");
		Name ename2 = new Name();
		ename2.setFirstName("Abhishikta");
		ename2.setMiddleName("");
		ename2.setLastName("Samal");
		Name ename3 = new Name();
		ename3.setFirstName("Manisha");
		ename3.setMiddleName("");
		ename3.setLastName("Lenka");
		Name ename4 = new Name();
		ename4.setFirstName("Md");
		ename4.setMiddleName("Adnan");
		ename4.setLastName("Khan");
		Name ename5 = new Name();
		ename5.setFirstName("Anita");
		ename5.setMiddleName("");
		ename5.setLastName("Ghos");

		Address eaddress1 = new Address();
		eaddress1.setArea("Bhuban");
		eaddress1.setDistrict("Dhenkanl");
		eaddress1.setZipcode(759017);
		Address eaddress2 = new Address();
		eaddress2.setArea("Bhuban");
		eaddress2.setDistrict("Dhenkanl");
		eaddress2.setZipcode(759017);
		Address eaddress3 = new Address();
		eaddress3.setArea("Bhuban");
		eaddress3.setDistrict("Dhenkanl");
		eaddress3.setZipcode(759017);
		Address eaddress4 = new Address();
		eaddress4.setArea("Bhuban");
		eaddress4.setDistrict("Dhenkanl");
		eaddress4.setZipcode(759017);
		Address eaddress5 = new Address();
		eaddress5.setArea("Bhuban");
		eaddress5.setDistrict("Dhenkanl");
		eaddress5.setZipcode(759017);

		Employee employee1 = new Employee();
		employee1.setEmployeeName(ename1);
		employee1.setEmployeeCode("E01");
		employee1.setJoinDate("10/12/2001");
		employee1.setSalary(12000);
		employee1.setEmployeeAddress(eaddress1);
		Employee employee2 = new Employee();
		employee2.setEmployeeName(ename2);
		employee2.setEmployeeCode("E02");
		employee2.setJoinDate("10/02/2011");
		employee2.setSalary(1500);
		employee2.setEmployeeAddress(eaddress2);
		Employee employee3 = new Employee();
		employee3.setEmployeeName(ename3);
		employee3.setEmployeeCode("E03");
		employee3.setJoinDate("15/12/2003");
		employee3.setSalary(12500);
		employee3.setEmployeeAddress(eaddress3);
		Employee employee4 = new Employee();
		employee4.setEmployeeName(ename4);
		employee4.setEmployeeCode("E04");
		employee4.setJoinDate("10/02/2011");
		employee4.setSalary(10000);
		employee4.setEmployeeAddress(eaddress4);
		Employee employee5 = new Employee();
		employee5.setEmployeeName(ename5);
		employee5.setEmployeeCode("E05");
		employee5.setJoinDate("11/05/2018");
		employee5.setSalary(10000);
		employee5.setEmployeeAddress(eaddress5);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		return employeeList;
		
	}

}
