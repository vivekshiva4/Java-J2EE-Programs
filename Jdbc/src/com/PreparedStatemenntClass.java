package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatemenntClass {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers has been loaded sucessfully");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("connection established sucessfully");

			String qry = "insert into vivek values(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(qry);
			stmt.setInt(1, 2);
			stmt.setString(2, "abc");
			stmt.setString(3, "xyz");
			int x = stmt.executeUpdate();
			
			if(x!=0){

			System.out.println("added values to database");
			}
		} catch (Exception e) {

			System.out.println("failed due to " + e);
		}

	}

}
