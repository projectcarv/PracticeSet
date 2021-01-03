package com.practice.assignment01;

public class EmployeeAddress {
    String empArea;
    String empDistrict;
    String empPinCode;

    public String getEmpArea() {
        return empArea;
    }

    public void setEmpArea(String empArea) {
        this.empArea = empArea;
    }

    public String getEmpDistrict() {
        return empDistrict;
    }

    public void setEmpDistrict(String empDistrict) {
        this.empDistrict = empDistrict;
    }

    public String getEmpPinCode() {
        return empPinCode;
    }

    public void setEmpPinCode(String empPinCode) {
        this.empPinCode = empPinCode;
    }

    @Override
    public String toString() {
        return empArea + " " + empDistrict + " " + empPinCode;
    }
}
