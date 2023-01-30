package com.cg.arraylist;

public class EmployeeDetails {
	private int empId;
	private String empname;
	private String empaddress;
	private int phNo;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public EmployeeDetails(int empId, String empname, String empaddress, int phNo) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empaddress = empaddress;
		this.phNo = phNo;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
