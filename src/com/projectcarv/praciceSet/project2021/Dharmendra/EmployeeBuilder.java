package com.projectcarv.praciceSet.project2021.Dharmendra;

import java.util.ArrayList;
import java.util.List;

import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Address;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Employee;
import com.projectcarv.praciceSet.project2021.Amarnath.Assignment.Name;

public class EmployeeBuilder {
	
	public List<Employee> buildEmployees(){
		List<Employee> employeeList = new ArrayList<Employee>();
		buildEmployee(employeeList);
		return employeeList;
	}

	private void buildEmployee(List<Employee> employeeList) {
		Employee emp01 = new Employee();
		Employee emp02 = new Employee();
		Employee emp03 = new Employee();
		Employee emp04 = new Employee();
		Employee emp05 = new Employee();
		Employee emp06 = new Employee();
		Employee emp07 = new Employee();
		Employee emp08 = new Employee();
		Employee emp09 = new Employee();
		Employee emp10 = new Employee();
	
		buildNameDetails(emp01,"JITENDRA","KUMAR","SAMAL");
		buildNameDetails(emp02,"AMARNATH"," ","BEHERA");
		buildNameDetails(emp03,"TWINKLE"," ","KHANA");
		buildNameDetails(emp04,"ABHISHIKTA"," ","SAMAL");
		buildNameDetails(emp05,"MOHAMMAD"," ","ADNAN");
		buildNameDetails(emp06,"MANISHA"," ","LENKA");
		buildNameDetails(emp07,"ANITA","KUMARI"," ");
		buildNameDetails(emp08,"DHARMENDRA","KUMAR","BISWAL");
		buildNameDetails(emp09,"SUVA"," ","SWAIN");
		buildNameDetails(emp10,"ABCD"," ","EFGH");
		
		buildOtherDetails(emp01,"E001","12-12-2020",10000);
		buildOtherDetails(emp02,"E002","01-11-2019",20000);
		buildOtherDetails(emp03,"E002","02-10-2018",50000);
		buildOtherDetails(emp04,"E002","03-09-2017",50000);
		buildOtherDetails(emp05,"E003","04-08-2016",50000);
		buildOtherDetails(emp06,"E004","05-07-2015",50000);
		buildOtherDetails(emp07,"E005","06-06-2014",60000);
		buildOtherDetails(emp08,"E006","07-05-2013",70000);
		buildOtherDetails(emp09,"E007","08-04-2012",80000);
		buildOtherDetails(emp10,"E007","09-03-2011",90000);
		
		buildAddressDetails(emp01,"MBAZAR","CUTTACK",754141);
		buildAddressDetails(emp02,"KHORDA","BBSR",754142);
		buildAddressDetails(emp03,"RASULGARGH","BBSR",754143);
		buildAddressDetails(emp04,"CCHOWK","CUTTACK",754144);
		buildAddressDetails(emp05,"BHADRAK","BHADRAK",754145);
		buildAddressDetails(emp06,"PARADEEP","JSPUR",754146);
		buildAddressDetails(emp07,"CUTTACK","CUTTACK",754147);
		buildAddressDetails(emp08,"DBAZAR","JAJPUR",754148);
		buildAddressDetails(emp09,"ABAZAR","BALESWAR",754149);
		buildAddressDetails(emp10,"CBAZAR","BRAHMAPUR",754150);
		
		employeeList.add(emp01);
		employeeList.add(emp02);
		employeeList.add(emp03);
		employeeList.add(emp04);
		employeeList.add(emp05);
		employeeList.add(emp06);
		employeeList.add(emp07);
		employeeList.add(emp08);
		employeeList.add(emp09);
		employeeList.add(emp10);
		
	}

	private void buildAddressDetails(Employee emp, String area,String district, int zip) {
		
		Address addr = new Address();
		addr.setArea(area);
		addr.setDistrict(district);
		addr.setZipcode(zip);
		
		emp.setEmployeeAddress(addr);
		
	}

	private void buildOtherDetails(Employee emp, String empCode,String joinDate, int salary) {
		
		emp.setEmployeeCode(empCode);
		emp.setJoinDate(joinDate);
		emp.setSalary(salary);
	}

	private void buildNameDetails(Employee emp,String fName, String mName, String lName) {
		
		Name name = new Name();
		name.setFirstName(fName);
		name.setMiddleName(mName);
		name.setLastName(lName);
	
		emp.setEmployeeName(name);
	}

}
