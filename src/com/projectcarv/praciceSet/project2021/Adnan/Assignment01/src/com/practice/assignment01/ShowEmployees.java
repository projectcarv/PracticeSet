package com.practice.assignment01;

public class ShowEmployees {

    // to show employee id only
    void showEmployeeId(Employees emp1, Employees emp2, Employees emp3, Employees emp4,
                        Employees emp5, Employees emp6, Employees emp7) {
        System.out.println(
                "--------------------Employees ID's are-----------\n" +
                        "----------------------------------------------\n" +
                        emp1.getEmpId() + "\n" +
                        emp2.getEmpId() + "\n" +
                        emp3.getEmpId() + "\n" +
                        emp4.getEmpId() + "\n" +
                        emp5.getEmpId() + "\n" +
                        emp6.getEmpId() + "\n" +
                        emp7.getEmpId() + "\n"
        );
    }

    // to show employee full address
    void showEmployeeAddress(Employees emp1, Employees emp2, Employees emp3, Employees emp4,
                             Employees emp5, Employees emp6, Employees emp7) {
        System.out.println(
                "--------------------Employees Id with Address-----------\n" +
                        "Id            Address\n" +
                        "---           ---------\n" +
                        emp1.getEmpId() + "          " + emp1.getEmpAddress() + "\n" +
                        emp2.getEmpId() + "          "  + emp2.getEmpAddress() + "\n" +
                        emp3.getEmpId() + "          "  + emp3.getEmpAddress() + "\n" +
                        emp4.getEmpId() + "          "  + emp4.getEmpAddress() + "\n" +
                        emp5.getEmpId() + "          "  + emp5.getEmpAddress() + "\n" +
                        emp6.getEmpId() + "          "  + emp6.getEmpAddress() + "\n" +
                        emp7.getEmpId() + "          "  + emp7.getEmpAddress() + "\n"
        );
    }

    // to show employee first name
    void showEmployeeFirstName(Employees emp1, Employees emp2, Employees emp3, Employees emp4,
                               Employees emp5, Employees emp6, Employees emp7) {
        System.out.println(
                "--------------------Employees First Name-----------\n" +
                        "----------------------------------------------\n" +
                        emp1.empName.getFirstName() + "\n" +
                        emp2.empName.getFirstName() + "\n" +
                        emp3.empName.getFirstName() + "\n" +
                        emp4.empName.getFirstName() + "\n" +
                        emp5.empName.getFirstName() + "\n" +
                        emp6.empName.getFirstName() + "\n" +
                        emp7.empName.getFirstName() + "\n"
        );
    }

    // to show employee first name with pin code
    void showEmployeePinCode(Employees emp1, Employees emp2, Employees emp3, Employees emp4,
                             Employees emp5, Employees emp6, Employees emp7) {
        System.out.println(
                "--------------------Employees Name with Pin code -----------\n" +
                        "Name                       Pin Code\n" +
                        "-----                      ---------\n" +
                        emp1.getEmpName() + emp1.getEmpAddress().getEmpPinCode() + "\n" +
                        emp2.getEmpName() + emp2.getEmpAddress().getEmpPinCode() + "\n" +
                        emp3.getEmpName() + emp3.getEmpAddress().getEmpPinCode() + "\n" +
                        emp4.getEmpName() + emp4.getEmpAddress().getEmpPinCode() + "\n" +
                        emp5.getEmpName() + emp5.getEmpAddress().getEmpPinCode() + "\n" +
                        emp6.getEmpName() + emp6.getEmpAddress().getEmpPinCode() + "\n" +
                        emp7.getEmpName() + emp7.getEmpAddress().getEmpPinCode() + "\n"
        );
    }

    // to show employee detail
    void showEmployeeDetails(Employees emp1, Employees emp2, Employees emp3, Employees emp4,
                             Employees emp5, Employees emp6, Employees emp7) {
        System.out.println(
                "------------------Employees Details-----------------\n" +
                        "Id           Name                       Contact              Designation           Salary           Join Date           Address\n" +
                        "----         ------                     ---------            --------------        ---------        ------              -------\n" +
                        emp1 + "\n" +
                        emp2 + "\n" +
                        emp3 + "\n" +
                        emp4 + "\n" +
                        emp5 + "\n" +
                        emp6 + "\n" +
                        emp7 + "\n"
        );
    }

}
