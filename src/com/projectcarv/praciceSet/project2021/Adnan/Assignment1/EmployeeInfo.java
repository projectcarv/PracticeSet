package com.projectcarv.praciceSet.project2021.Adnan.Assignment1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {
    public List<Employees> createEmployee() {
        List<Employees> employees = new ArrayList<Employees>();
        Employees emp1 = new Employees();
        Employees emp2 = new Employees();
        Employees emp3 = new Employees();
        Employees emp4 = new Employees();
        Employees emp5 = new Employees();
        Employees emp6 = new Employees();
        Employees emp7 = new Employees();

        EmployeeName name1 = new EmployeeName();
        name1.firstName = "Md";
        name1.middleName = "Adnan";
        name1.lastName = "Khan             ";
        EmployeeAddress address1 = new EmployeeAddress();
        address1.empArea = "BBSR,";
        address1.empDistrict = "Khurda,";
        address1.empPinCode = "755001";

        EmployeeName name2 = new EmployeeName();
        name2.firstName = "Anita";
        name2.middleName = "";
        name2.lastName = "Gupta              ";
        EmployeeAddress address2 = new EmployeeAddress();
        address2.empArea = "Nuapada,";
        address2.empDistrict = "Nuapada,";
        address2.empPinCode = "766105";

        EmployeeName name3 = new EmployeeName();
        name3.firstName = "Aditya";
        name3.middleName = "Narayan";
        name3.lastName = "Pradhan    ";
        EmployeeAddress address3 = new EmployeeAddress();
        address3.empArea = "Khandagiri,";
        address3.empDistrict = "Khurda,";
        address3.empPinCode = "755006";

        EmployeeName name4 = new EmployeeName();
        name4.firstName = "Ayush";
        name4.middleName = "Kumar";
        name4.lastName = "Yadav         ";
        EmployeeAddress address4 = new EmployeeAddress();
        address4.empArea = "Jharsuguda,";
        address4.empDistrict = "Jharsuguda,";
        address4.empPinCode = "768201";

        EmployeeName name5 = new EmployeeName();
        name5.firstName = "Archana";
        name5.middleName = "";
        name5.lastName = "Nayak            ";
        EmployeeAddress address5 = new EmployeeAddress();
        address5.empArea = "Niladri Vihar,";
        address5.empDistrict = "Khurda,";
        address5.empPinCode = "755001";

        EmployeeName name6 = new EmployeeName();
        name6.firstName = "Aditya";
        name6.middleName = "Narayan";
        name6.lastName = "Lenka      ";
        EmployeeAddress address6 = new EmployeeAddress();
        address6.empArea = "Paradeep,";
        address6.empDistrict = "Paradeep,";
        address6.empPinCode = "754210";

        EmployeeName name7 = new EmployeeName();
        name7.firstName = "Ankita";
        name7.middleName = "";
        name7.lastName = "Nayak             ";
        EmployeeAddress address7 = new EmployeeAddress();
        address7.empArea = "Fire Station,";
        address7.empDistrict = "Khurda,";
        address7.empPinCode = "751003";

        emp1.empId = "E101";
        emp1.empName = name1;
        emp1.empContactNo = "9853425987";
        emp1.empDesignation = "Manager              ";
        emp1.empSalary = "30,000";
        emp1.empJoinDate = "10-10-2020";
        emp1.empAddress = address1;

        emp2.empId = "E102";
        emp2.empName = name2;
        emp2.empContactNo = "9853425987";
        emp2.empDesignation = "Senior Manager       ";
        emp2.empSalary = "40,000";
        emp2.empJoinDate = "10-01-2020";
        emp2.empAddress = address2;

        emp3.empId = "E103";
        emp3.empName = name3;
        emp3.empContactNo = "9853425987";
        emp3.empDesignation = "Trainee              ";
        emp3.empSalary = "20,000";
        emp3.empJoinDate = "01-09-2020";
        emp3.empAddress = address3;

        emp4.empId = "E104";
        emp4.empName = name4;
        emp4.empContactNo = "9853425987";
        emp4.empDesignation = "Assistant            ";
        emp4.empSalary = "25,000";
        emp4.empJoinDate = "01-01-2022";
        emp4.empAddress = address4;

        emp5.empId = "E105";
        emp5.empName = name5;
        emp5.empContactNo = "9853425987";
        emp5.empDesignation = "Tr Developer         ";
        emp5.empSalary = "20,000";
        emp5.empJoinDate = "07-01-2021";
        emp5.empAddress = address5;

        emp6.empId = "E106";
        emp6.empName = name6;
        emp6.empContactNo = "9853425987";
        emp6.empDesignation = "Junior Manager       ";
        emp6.empSalary = "35,000";
        emp6.empJoinDate = "17-06-2020";
        emp6.empAddress = address6;

        emp7.empId = "E107";
        emp7.empName = name7;
        emp7.empContactNo = "9853425987";
        emp7.empDesignation = "Floor Manager        ";
        emp7.empSalary = "12,000";
        emp7.empJoinDate = "10-08-2020";
        emp7.empAddress = address7;

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);

        return employees;
    }
}

