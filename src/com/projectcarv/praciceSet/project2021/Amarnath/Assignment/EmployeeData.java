package com.projectcarv.praciceSet.project2021.Amarnath.Assignment;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	public List<Employee> generateEmployee(){
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		Name name = new Name();
		name.setFirstName("Amarnath");
		name.setMiddleName("");
		name.setLastName("Behera");
		Address address = new Address();
		address.setArea("Bhuban");
		address.setDistrict("Dhenkanal");
		address.setZipcode(759017);

		Name name1 = new Name();
		name1.setFirstName("Jaya");
		name1.setMiddleName("Ram");
		name1.setLastName("Behera");
		Address address1 = new Address();
		address1.setArea("Patrapada");
		address1.setDistrict("Bhubaneswar");
		address1.setZipcode(751001);

		Name name2 = new Name();
		name2.setFirstName("Jaya");
		name2.setMiddleName("Krushna");
		name2.setLastName("Behera");
		Address address2 = new Address();
		address2.setArea("Patia");
		address2.setDistrict("Bhubaneswar");
		address2.setZipcode(752001);

		Name name3 = new Name();
		name3.setFirstName("Raghu");
		name3.setMiddleName("Ram");
		name3.setLastName("Behera");
		Address address3 = new Address();
		address3.setArea("Jajpur");
		address3.setDistrict("Jajpur");
		address3.setZipcode(752201);

		Name name4 = new Name();
		name4.setFirstName("Hara");
		name4.setMiddleName("Priya");
		name4.setLastName("Sahoo");
		Address address4 = new Address();
		address4.setArea("Bhuban");
		address4.setDistrict("Dhenkanal");
		address4.setZipcode(759017);

		employee1.setEmployeeName(name);
		employee1.setEmployeeAddress(address);
		employee1.setEmployeeCode("A123");
		employee1.setJoinDate("17/12/2020");
		employee1.setSalary(70000);

		employee2.setEmployeeName(name1);
		employee2.setEmployeeAddress(address1);
		employee2.setEmployeeCode("A124");
		employee2.setJoinDate("17/10/2020");
		employee2.setSalary(75000);

		employee3.setEmployeeName(name2);
		employee3.setEmployeeAddress(address2);
		employee3.setEmployeeCode("A125");
		employee3.setJoinDate("10/2/2020");
		employee3.setSalary(70500);

		employee4.setEmployeeName(name3);
		employee4.setEmployeeAddress(address3);
		employee4.setEmployeeCode("A126");
		employee4.setJoinDate("23/12/2020");
		employee4.setSalary(500000);

		employee5.setEmployeeName(name4);
		employee5.setEmployeeAddress(address4);
		employee5.setEmployeeCode("A127");
		employee5.setJoinDate("23/12/2020");
		employee5.setSalary(5000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		return employeeList;
		
	}
}
