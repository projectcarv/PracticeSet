package com.projectcarv.praciceSet.project2021.abhishiktasamal431.Assignment2;

import java.util.List;

import com.projectcarv.praciceSet.project2021.abhishiktasamal431.Assignment1.Employee;
import com.projectcarv.praciceSet.project2021.abhishiktasamal431.Assignment1.EmployeeCreater;

public class EmpValidate {
	public static void empValidate(int validate) throws CountException {
		if (validate > 5) {
			throw new CountException("No of employees should be less than 5...");
		}
	}

	public static void foundManager(String mvalue) throws EmployeeAttributeException {
		EmployeeCreater employeeCreater = new EmployeeCreater();
		List<Employee> empList = employeeCreater.createEmployess();
		String nm = "name", nm1 = "Name", eid = "eid", eid1 = "EId", jdt = "joindate", jdt1 = "JoinDate",
				sal = "Salary", ead = "alldetails", mng = "manager", mng1 = "Manager";
		if(mvalue.equals(nm)||mvalue.equals(nm1)){
			for (Employee emp : empList) {
				System.out.println(emp.getEmployeeName());
			}
		}else if(mvalue.equals(eid)||mvalue.equals(eid1)){
			for (Employee emp : empList) {
				System.out.println(emp.getEmployeeId());
			}
		}else if(mvalue.equals(jdt)||mvalue.equals(jdt1)){
			for (Employee emp : empList) {
				System.out.println(emp.getEmployeeJoinDate());
			}
		}else if(mvalue.equals(sal)){
			for (Employee emp : empList) {
				System.out.println(emp.getEmployeeSalary());
			}
		}else if(mvalue.equals(ead)){
			for (Employee emp : empList) {
				System.out
				.println("EID   " + "  ENAME           " + "  ESALARY    " + " EJOINDATE  " + "          EADDRESS");
		System.out.println(
				"------" + "--------------    " + "----------   " + " ---------- " + "    ---------------");
		System.out.println(emp);
			}
		}else if(mvalue.equals(mng)||mvalue.equals(mng1)){
			for (Employee emp : empList) {
				throw new EmployeeAttributeException("This Manager is not present in Employee");
			}
	}}
}
