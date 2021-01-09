package com.projectcarv.praciceSet.project2021.Adnan.Assignment1;

public class EmployeeAddress {
    private String empArea;
    private String empDistrict;
    private String empPinCode;

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
