package com.cg.day8.empmang;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1234,"Balakrishnan KS",10000.90f);
		Employee emp2 = new Employee(34242,"Jamaludeen A",8750.34f);
		Employee emp3 = new Employee(34242,"Jeyaprakash",11233.12f);
		ArrayList<Employee> data = new ArrayList<Employee>();
		data.add(emp1);
		data.add(emp2);
		data.add(emp3);
		System.out.println("Elements of the arraylist");
		for(Employee emp:data) {
			System.out.println(emp.getEmpid() + "\t" + emp.getEmpname()+ "\t" + emp.getEmpsal());
		}
		Collections.sort(data);
		
		System.out.println("Elements of students after sort");
		for(Employee emp:data) {
			System.out.println(emp.getEmpid() + "\t" + emp.getEmpname()+ "\t" + emp.getEmpsal());
		}


	}

}
