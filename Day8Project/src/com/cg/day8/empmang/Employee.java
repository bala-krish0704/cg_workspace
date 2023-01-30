package com.cg.day8.empmang;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String empname;
	private double empsal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, double empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	public int compareTo(Employee emp) {
		if(this.empsal == emp.empsal)
			return 0;
		else
			return this.empsal > emp.empsal ? 1 : -1;
	}

}
