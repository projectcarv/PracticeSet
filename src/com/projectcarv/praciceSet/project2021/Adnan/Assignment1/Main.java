package com.projectcarv.praciceSet.project2021.Adnan.Assignment1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeInfo empInfo = new EmployeeInfo();
        List<Employees> employees = empInfo.createEmployee();
        ShowEmployees showEmployees = new ShowEmployees();

        while (true) {
            System.out.println("What you want to view: \n" +
                    "1: Employees Id and Address\n" +
                    "2: Employees First Name and Pin Code\n" +
                    "3: Employees Details\n" +
                    "Exit: Press any other number to Exit");
            Scanner input = new Scanner(System.in);
            int show = input.nextInt();
            switch (show) {
                case 1: {
                    System.out.println("\t1: Only Employee Id: \n" +
                            "\t2: Employee Id with Address: ");
                    Scanner sc = new Scanner(System.in);
                    int viewId = input.nextInt();
                    switch (viewId) {
                        case 1: {
                            showEmployees.showEmployeeId(employees.get(0), employees.get(1), employees.get(2), employees.get(3), employees.get(4), employees.get(5), employees.get(6));
                        }
                        break;
                        case 2: {
                            showEmployees.showEmployeeAddress(employees.get(0), employees.get(1), employees.get(2), employees.get(3), employees.get(4), employees.get(5), employees.get(6));
                        }
                    }
                }
                break;

                case 2: {
                    System.out.println("\t1: Only Employee First Name: \n" +
                            "\t2: Employee Name with Pin Code: ");
                    Scanner sc = new Scanner(System.in);
                    int viewName = sc.nextInt();
                    switch (viewName) {
                        case 1: {
                            showEmployees.showEmployeeFirstName(employees.get(0), employees.get(1), employees.get(2), employees.get(3), employees.get(4), employees.get(5), employees.get(6));
                        }
                        break;
                        case 2: {
                            showEmployees.showEmployeePinCode(employees.get(0), employees.get(1), employees.get(2), employees.get(3), employees.get(4), employees.get(5), employees.get(6));
                        }
                    }
                }
                break;

                case 3: {
                    showEmployees.showEmployeeDetails(employees.get(0), employees.get(1), employees.get(2), employees.get(3), employees.get(4), employees.get(5), employees.get(6));
                }

            }
            if (show > 3) {
                break;
            }
        }
    }
}

