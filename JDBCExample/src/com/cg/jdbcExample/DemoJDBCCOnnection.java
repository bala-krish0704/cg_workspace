package com.cg.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBCCOnnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo_database", "postgres", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from department");
		System.out.println("Employees Data.....");
		System.out.println(" \t Dept ID \t Dept name \t deptlocation" );
		while(rs.next()) {
			System.out.println(rs.getInt("deptid") + "\t" +rs.getString("deptname") + "\t" + rs.getString("deptloc"));
		}
		
		

	}

}
