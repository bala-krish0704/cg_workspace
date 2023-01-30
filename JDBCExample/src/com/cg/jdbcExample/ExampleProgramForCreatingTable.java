package com.cg.jdbcExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleProgramForCreatingTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database","postgres","root");
		Statement stmt = conn.createStatement();
		boolean result = stmt.execute("Create table movie(movieid INT, moviename TEXT, theatername TEXT)");
		if(! result) {
			System.out.println("The table created successfully");
		}else {
			System.out.println("The table not created successfully");
		}

	}

}
