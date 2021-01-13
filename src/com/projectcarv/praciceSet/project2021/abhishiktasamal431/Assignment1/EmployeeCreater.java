package com.projectcarv.praciceSet.project2021.abhishiktasamal431.Assignment1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCreater {
	public List<Employee> createEmployess() {
		List<Employee> employeeList = new ArrayList<>();
		createEmployee(employeeList);
		return employeeList;
	}

	private void createEmployee(List<Employee> employeeList) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Employee emp5 = new Employee();

		createNameDetails(emp1, "Abhishikta", "", "Samal");
		createNameDetails(emp2, "Amarnath", "", "Behera");
		createNameDetails(emp3, "Manisha", "", "Lenka");
		createNameDetails(emp4, "Dharmendra", "", "Sahoo");
		createNameDetails(emp5, "Twinkle", "", "Kar");

		createAddressDetails(emp1, "Jajpur", "Jajpur", 755001);
		createAddressDetails(emp2, "Bhuban", "Dhenkanal", 759017);
		createAddressDetails(emp3, "Bhadrak", "Bhadrak", 755101);
		createAddressDetails(emp4, "Bhubaneswar", "Khorda", 751001);
		createAddressDetails(emp5, "Bhadrak", "Bhadrak", 755101);

		createOtherDetails(emp1, "E001", "12-10-2001", 10000);
		createOtherDetails(emp2, "E002", "23-11-2009", 2000);
		createOtherDetails(emp3, "E003", "22-12-2007", 1500);
		createOtherDetails(emp4, "E004", "02-09-2017", 25000);
		createOtherDetails(emp5, "E004", "11-02-2011", 24800);

		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
	}

	private void createOtherDetails(Employee emp, String eCode, String jDate, int eSalary) {
		emp.setEmployeeId(eCode);
		emp.setEmployeeJoinDate(jDate);
		emp.setEmployeeSalary(eSalary);

	}

	private void createAddressDetails(Employee emp, String eArea, String eDistrict, int eZipCode) {
		Address address = new Address();
		address.setArea(eArea);
		address.setDistrict(eDistrict);
		address.setZipCode(eZipCode);

		emp.setEmployeeAddress(address);

	}

	private void createNameDetails(Employee emp, String fName, String mName, String lName) {
		Name name = new Name();
		name.setFirstName(fName);
		name.setMiddleName(mName);
		name.setLastName(lName);

		emp.setEmployeeName(name);

	}

}
