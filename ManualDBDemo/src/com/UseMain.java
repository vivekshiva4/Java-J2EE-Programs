package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;



public class UseMain {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		

		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("-- Driver loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "vivek", "vivek");
			System.out.println("-- Connection estabished");

			String qry="insert into logindetails values(?,?,?,?,?)";
			
			java.sql.PreparedStatement stmt= con.prepareStatement(qry);
			stmt.setInt(1, 11);
			stmt.setString(2, "arg1");
			stmt.setString(3, dateFormat.format(date));
			stmt.setInt(4, 10);
			stmt.setInt(5, 10);
			
			
		    int x = stmt.executeUpdate();
			
			System.out.println("sucess");
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		}

}
