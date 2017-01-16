package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers has been loaded sucessfully");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection established sucessfully");

			String qry = "create table vivek( sno int,firstname varchar(255),lastname varchar(255));";
			Statement stmt = con.createStatement();
			int x = stmt.executeUpdate(qry);

			System.out.println("table created sucessfully");

		} catch (Exception e) {

			System.out.println("failed due to " + e);
		}

	}

}
