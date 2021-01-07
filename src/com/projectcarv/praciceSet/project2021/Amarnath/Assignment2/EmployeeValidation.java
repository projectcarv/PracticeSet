package com.projectcarv.praciceSet.project2021.Amarnath.Assignment2;

public class EmployeeValidation {

	public static void EmployeeValidation(int value) throws EmployeeCountException{
		if (value == 0 || value > 5) {
			throw new EmployeeCountException(
					"No of employees should be less than 5 & greater than 0 You are trying to added :" + value);
		} else {
			EmpCreation.empCreation(value);

		}
	}

	public static void ManagerFound(String found) throws EmployeeAttributeException {
		String nm = "Name", nm1 = "name", id = "id", jdate = "joindate", jdate1 = "JoinDate", ad = "alldetails",
				ad1 = "AllDetails", mng = "manager", mng1 = "Manager";
		if (found.equals(nm) || found.equals(nm1)) {
			DisplayEmployee.displayName();
		} else if (found.equals(id)) {
			DisplayEmployee.displayId();
		} else if (found.equals(jdate) || found.equals(jdate1)) {
			DisplayEmployee.displayAllDetails();
		} else if (found.equals(ad) || found.equals(ad1)) {
			DisplayEmployee.displayAllDetails();
		} else if (found.equals(mng) || found.equals(mng1)) {
			throw new EmployeeAttributeException("ERST_ATTR_EMP=This Manager is not present in Employee");
		} else {

			throw new EmployeeAttributeException("ERST_ATTR_EMP=This "+found+" is not present in Employee ");
			
		}
	}

}
