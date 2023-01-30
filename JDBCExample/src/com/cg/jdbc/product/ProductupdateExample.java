package com.cg.jdbc.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductupdateExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		PreparedStatement ptmt = con.prepareStatement("UPDATE product SET productprice = ? WHERE productid = ?;");
		System.out.println("Enter the product id to submit");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		System.out.println("Enter the price to update");
		int price = in.nextInt();
		ptmt.setInt(1, price);
		ptmt.setInt(2, id);
		int result = ptmt.executeUpdate();
		if(result !=0)
			System.out.println("The data updated successfully");
		else {
			System.out.println("The data not updated");
		}
		
		
	}

}
