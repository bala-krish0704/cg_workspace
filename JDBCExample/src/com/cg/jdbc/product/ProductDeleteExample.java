package com.cg.jdbc.product;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductDeleteExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		
	}

}
