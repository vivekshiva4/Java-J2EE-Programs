package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataBase{

	public boolean Register(SecondPojo sp) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("-- Connection estabished");

			String qry = "insert into  user values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setString(1, sp.getUserId());
			ps.setString(2, sp.getPassword());
			ps.setString(3, sp.getFirstname());
			ps.setString(4, sp.getLastname());
			ps.setString(5, sp.getDob());
			int x = ps.executeUpdate();
			System.out.println("Hello");
			if (x != 0) {
				return true;

			}

		} catch (Exception e) {
			System.out.println("failed due to" + e);
		}

		return false;

	}

}
