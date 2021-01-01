package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	List<Name> nameList = new ArrayList<Name>();
	public List<Name> setName() {
		

		nameList.add(new Name("Amarnath", "", "Behera"));
		nameList.add(new Name("Abhishikta", "", "Samal"));
		nameList.add(new Name("Manisha", "", "Lenka"));
		nameList.add(new Name("Md", "", "Adnan"));
		nameList.add(new Name("Anita", "", "Ghosh"));
		return nameList;

	}
	List<Address> addressList = new ArrayList<Address>();
	public List<Address> setAddress() {
		

		addressList.add(new Address("Bhuban","Dhenkanal",759017));
		addressList.add(new Address("Bhadrak","Bhadrak",759125));
		addressList.add(new Address("Jajpur","Jajpur",75907));
		addressList.add(new Address("Patia","Bhubaneswar",759217));
		addressList.add(new Address("Cuttuck","Cuttuck",759317));
		return addressList;

	}

	public List<Employee> generateEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(nameList.get(0), "A123","12/12/2020",12000, addressList.get(0)));
		employeeList.add(new Employee(nameList.get(1),"A124","11/12/2020",13000,addressList.get(1)));
		employeeList.add(new Employee(nameList.get(2),"A125","10/12/2020",14000,addressList.get(2)));
		employeeList.add(new Employee(nameList.get(3),"A126","09/12/2020",15000,addressList.get(3)));
		employeeList.add(new Employee(nameList.get(4),"A127","08/12/2020",16000,addressList.get(4)));
		return employeeList;

	}
}
