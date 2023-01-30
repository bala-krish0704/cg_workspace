package com.cg.jdbc.actorexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ActorData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		PreparedStatement ptmt = con.prepareStatement("INSERT INTO actor VALUES(?,?);");
		System.out.println("Enter the count of data to be stored");
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int result = 0;
		for(int i = 0 ; i < count; i++) {
			System.out.println("Enter the actor id");
			int aid = in.nextInt();
			ptmt.setInt(1, aid);
			System.out.println("Enter the actor name");
			in.nextLine();
			String aname = in.nextLine();
			ptmt.setString(2, aname);
			result = ptmt.executeUpdate();
			
		}
		if(count == result)
			System.out.println("Data updated successfully");
		else
			System.out.println("Data not entered");
		
	}

}
