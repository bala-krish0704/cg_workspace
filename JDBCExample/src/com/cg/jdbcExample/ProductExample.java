package com.cg.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		PreparedStatement ptmt = conn.prepareStatement("Insert into product values(?,?,?);");
		Scanner in = new Scanner(System.in);
		System.out.println("ENter how many set of data to be executed");
		int count = in.nextInt();
		int result=0;
		for(int i = 0 ; i < count; i++) {
			System.out.println("Enter the product ID");
			int pid = in.nextInt();
			ptmt.setInt(1,pid);
			System.out.println("Enter the product name");
			in.nextLine();
			String pname = in.nextLine();
			ptmt.setString(2, pname);
			System.out.println("Enter the product price");
			int pprice = in.nextInt();
			ptmt.setInt(3,pprice);
			result = ptmt.executeUpdate();
		}
		System.out.println(result + "  "+ count);
		if(count == result) {
			System.out.println("All the data are store successfully"+result+"data");
		}else {
			System.out.println("Data not stored successfully");
		}
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM product");
		System.out.println("**************PRODUCT IN DATABASE*****************");
		System.out.println("product id \tproduct name \t product price");
		
		while(rs.next()) {
			System.out.println(rs.getInt("productid")+"\t"+rs.getString("productname")+"\t"+rs.getInt("productprice"));
			
			
		}
		
		

	}

}
