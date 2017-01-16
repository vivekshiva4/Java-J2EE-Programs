package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class Clas {
	Connection con = null;
	public Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drivers loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "vivek", "vivek");
			System.out.println("connection established");

		} catch (Exception e) {
			e.printStackTrace();

		}

		return con;
	}

	public boolean connectionClosed() {
		boolean status = false;
		try {
			if (con != null) {
				con.close();
				status=true;
				System.out.println("connection is closed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}

	public static void main(String[] args) {

		Clas cc = new Clas();
		cc.getConnection();
		cc.connectionClosed();

	}

}
