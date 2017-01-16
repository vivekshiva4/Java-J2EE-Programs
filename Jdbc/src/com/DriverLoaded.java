package com;

public class DriverLoaded {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers has been loaded sucessfully");
			//we have set jar files in build path for loading drivers
		} catch (Exception e) {
			
			System.out.println("drivers are not loaded because of "+e);
		}
	}

}
