package Assignment;
import Assignment.Address;
import Assignment.DisplayEmployee;
public class Employee {
	Name employeeName;
	String employeeCode;
	String joinDate;
	int salary;
	Address employeeAddress;
	public Name getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(Name employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeCode=" + employeeCode + ", joinDate=" + joinDate
				+ ", salary=" + salary + ", employeeAddress=" + employeeAddress + "]";
	}
}
