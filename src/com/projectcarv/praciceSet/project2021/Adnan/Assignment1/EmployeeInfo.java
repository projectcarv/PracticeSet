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
        name1.setFirstName("Md");
        name1.setMiddleName("Adnan");
        name1.setLastName("Khan             ");
        EmployeeAddress address1 = new EmployeeAddress();
        address1.setEmpArea("BBSR,");
        address1.setEmpDistrict("Khurda,");
        address1.setEmpPinCode("755001");

        EmployeeName name2 = new EmployeeName();
        name2.setFirstName("Anita");
        name2.setMiddleName("");
        name2.setLastName("Gupta              ");
        EmployeeAddress address2 = new EmployeeAddress();
        address2.setEmpArea("Nuapada,");
        address2.setEmpDistrict("Nuapada,");
        address2.setEmpPinCode("766105");

        EmployeeName name3 = new EmployeeName();
        name3.setFirstName("Aditya");
        name3.setMiddleName("Narayan");
        name3.setLastName("Pradhan    ");
        EmployeeAddress address3 = new EmployeeAddress();
        address3.setEmpArea("Khandagiri,");
        address3.setEmpDistrict("Khurda,");
        address3.setEmpPinCode("755006");

        EmployeeName name4 = new EmployeeName();
        name4.setFirstName("Ayush");
        name4.setMiddleName("Kumar");
        name4.setLastName("Yadav         ");
        EmployeeAddress address4 = new EmployeeAddress();
        address4.setEmpArea("Jharsuguda,");
        address4.setEmpDistrict("Jharsuguda,");
        address4.setEmpPinCode("768201");

        EmployeeName name5 = new EmployeeName();
        name5.setFirstName("Archana");
        name5.setMiddleName("");
        name5.setLastName("Nayak            ");
        EmployeeAddress address5 = new EmployeeAddress();
        address5.setEmpArea("Niladri Vihar,");
        address5.setEmpDistrict("Khurda,");
        address5.setEmpPinCode("755001");

        EmployeeName name6 = new EmployeeName();
        name6.setFirstName("Aditya");
        name6.setMiddleName("Narayan");
        name6.setLastName("Lenka      ");
        EmployeeAddress address6 = new EmployeeAddress();
        address6.setEmpArea("Paradeep,");
        address6.setEmpDistrict("Paradeep,");
        address6.setEmpPinCode("754210");

        EmployeeName name7 = new EmployeeName();
        name7.setFirstName("Ankita");
        name7.setMiddleName("");
        name7.setLastName("Nayak             ");
        EmployeeAddress address7 = new EmployeeAddress();
        address7.setEmpArea("Fire Station,");
        address7.setEmpDistrict("Khurda,");
        address7.setEmpPinCode("751003");

        emp1.setEmpId("E101");
        emp1.empName = name1;
        emp1.setEmpContactNo("9853425987");
        emp1.setEmpDesignation("Manager              ");
        emp1.setEmpSalary("30,000");
        emp1.setEmpJoinDate("10-10-2020");
        emp1.empAddress = address1;

        emp2.setEmpId("E102");
        emp2.empName = name2;
        emp2.setEmpContactNo("9853425987");
        emp2.setEmpDesignation("Senior Manager       ");
        emp2.setEmpSalary("40,000");
        emp2.setEmpJoinDate("10-01-2020");
        emp2.empAddress = address2;

        emp3.setEmpId("E103");
        emp3.empName = name3;
        emp3.setEmpContactNo("9853425987");
        emp3.setEmpDesignation("Trainee              ");
        emp3.setEmpSalary("20,000");
        emp3.setEmpJoinDate("01-09-2020");
        emp3.empAddress = address3;

        emp4.setEmpId("E104");
        emp4.empName = name4;
        emp4.setEmpContactNo("9853425987");
        emp4.setEmpDesignation("Assistant            ");
        emp4.setEmpSalary("25,000");
        emp4.setEmpJoinDate("01-01-2022");
        emp4.empAddress = address4;

        emp5.setEmpId("E105");
        emp5.empName = name5;
        emp5.setEmpContactNo("9853425987");
        emp5.setEmpDesignation("Tr Developer         ");
        emp5.setEmpSalary("20,000");
        emp5.setEmpJoinDate("07-01-2021");
        emp5.empAddress = address5;

        emp6.setEmpId("E106");
        emp6.empName = name6;
        emp6.setEmpContactNo("9853425987");
        emp6.setEmpDesignation("Junior Manager       ");
        emp6.setEmpSalary("35,000");
        emp6.setEmpJoinDate("17-06-2020");
        emp6.empAddress = address6;

        emp7.setEmpId("E107");
        emp7.empName = name7;
        emp7.setEmpContactNo("9853425987");
        emp7.setEmpDesignation("Floor Manager        ");
        emp7.setEmpSalary("12,000");
        emp7.setEmpJoinDate("10-08-2020");
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

