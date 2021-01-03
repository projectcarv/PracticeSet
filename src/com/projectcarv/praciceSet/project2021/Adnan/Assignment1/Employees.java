package com.projectcarv.praciceSet.project2021.Adnan.Assignment1;

public class Employees {
    String empId;
    EmployeeName empName;
    String empContactNo;
    String empDesignation;
    String empSalary;
    String empJoinDate;
    EmployeeAddress empAddress;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public EmployeeName getEmpName() {
        return empName;
    }

    public void setEmpName(EmployeeName empName) {
        this.empName = empName;
    }

    public String getEmpContactNo() {
        return empContactNo;
    }

    public void setEmpContactNo(String empContactNo) {
        this.empContactNo = empContactNo;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpJoinDate() {
        return empJoinDate;
    }

    public void setEmpJoinDate(String empJoinDate) {
        this.empJoinDate = empJoinDate;
    }

    public EmployeeAddress getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(EmployeeAddress empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return empId + "         " + empName + empContactNo + "            " + empDesignation + empSalary + "           " + empJoinDate + "          " + empAddress;
    }
}
