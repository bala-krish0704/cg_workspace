package com.cg.jdbc.courseexample;

import java.sql.SQLException;
import java.util.Scanner;

public class CourseCRUD {
	static Scanner in = new Scanner(System.in);
	public void courseCRUD() throws ClassNotFoundException, SQLException {
		System.out.println("Select any one option to perfomr the operation");
		System.out.println("1.Create table \n 2.Insert into table \n 3.update table \n 4. display \n 5.delete  table");
		char ch = 'y';
		while(ch == 'y' || ch == 'Y') {
		System.out.println("Enter your choice");
		int choice = in.nextInt();
		CourseOperation op = new CourseOperation();
			switch(choice) {
			case 1 :
				op.createTable();
				break;
			case 2 :
				op.insertValue();
				break;
			case 3:
				op.updateValue();
				break;
			case 4 :
				op.display();
				break;
			case 5:
				op.deleteTable();
				break;
			default :
					System.out.println("Enter the valid option");
			}
			System.out.println("Do you want to continue, if yes enter 'y' else enter 'n' ");
			ch = in.next().charAt(0);
			
			
		}
		
		

	}

}
