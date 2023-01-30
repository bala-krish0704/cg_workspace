package com.cg.jdbc.courseexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseOperation {
	Scanner in = new Scanner(System.in);
		
	public void createTable() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		Statement stmt = con.createStatement(); 
		boolean result = stmt.execute("CREATE TABLE course (courseid INT,coursename TEXT,coursefee INT);");
		if(! result)
			System.out.println("Table created successfully");
		else
			System.out.println("Table not created");
	}
	public void insertValue() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		PreparedStatement ptmt = con.prepareStatement("INSERT INTO course VALUES (?,?,?);");
		
		System.out.println("Enter the course id");
		int id = in.nextInt();
		System.out.println("Enter the course name");
		in.nextLine();
		String name = in.nextLine();
		System.out.println("Enter the course fee");
		int fee = in.nextInt();
		ptmt.setInt(1, id);
		ptmt.setString(2, name);
		ptmt.setInt(3, fee);
		int result = ptmt.executeUpdate();
		if(result != 0 )
			System.out.println("Data stored successfully");
		else
			System.out.println("Data not stored");	
	}
	public void updateValue() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		System.out.println("Enter the value to course id to updagte");
		int id = in.nextInt();
		System.out.println("Enter the fees value to be updated");
		int fee =in.nextInt();
		PreparedStatement ptmt = con.prepareStatement("UPDATE course SET coursefee = ? WHERE courseid = ? ;");
		ptmt.setInt(1, fee);
		ptmt.setInt(2, id);
		int result = ptmt.executeUpdate();
		if(result !=0)
			System.out.println("Data updated successfully");
		else
			System.out.println("Data not updated ");
		
	}
	public void display() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		Statement stm = con.createStatement();
		ResultSet result  = stm.executeQuery("SELECT * FROM course ; ");
		System.out.println("COURSE ID \t COURSE NAME \t COURSE FEE");
		while(result.next()) {
			System.out.println(result.getInt("courseid") + "\t" +result.getString("coursename") + "\t" + result.getInt("coursefee"));
		}		
	}
	public void deleteTable() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		Statement stm = con.createStatement();
		boolean rs = stm.execute("DROP TABLE course;");
		if(! rs)
			System.out.println("Query executed successfully");
		else {
			System.out.println("Failed to drop a table");
		}
		
		
	}
	
		// TODO Auto-generated method stub
		
	
}


