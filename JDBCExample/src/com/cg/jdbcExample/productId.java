package com.cg.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class productId {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database", "postgres", "root");

	}

}
