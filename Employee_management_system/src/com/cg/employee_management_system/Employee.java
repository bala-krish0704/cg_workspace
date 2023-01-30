package com.cg.employee_management_system;

public class Employee {
	private int employeId;
	private String employeeName;
	private float empSalary;
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeId=" + employeId + ", employeeName=" + employeeName + ", empSalary=" + empSalary + "]";
	}
	
}
