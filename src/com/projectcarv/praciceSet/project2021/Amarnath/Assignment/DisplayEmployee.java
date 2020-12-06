package Assignment;

import java.util.ArrayList;
import java.util.List;
import Assignment.Employee;
import Assignment.*;

public class DisplayEmployee {
	void displayEmployeeName(String empName){
		System.out.println("***Employess Name are***");
		System.out.println(empName);
		
		 
	}
	void displayEmployeeCode(String empCode){
		System.out.println("***Employess EmpCodes are***");
		System.out.println(empCode);
		 
	}
public void displayEmployeeDetails(String employeeName, String employeeCode, String joinDate, int salary,String area,String district,int zipcode) {
	System.out.println("***Employess details are***");
	System.out.println("Employee Name: "+employeeName);
	System.out.println("Employee Code: "+employeeCode);
	System.out.println("Employee Joinning Date: "+joinDate);
	System.out.println("Employee Salary: "+salary);
	System.out.println("***Employee Address***");
	System.out.println("Employee Area: "+area);
	System.out.println("Employee District: "+district);
	System.out.println("Employee Zipcode: "+zipcode);
	}
}
