package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.jasper.tagplugins.jstl.core.Catch;

public class LoginDb {
	public Boolean validateUser(String userId,String password){
	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","vivek", "vivek");
	
	String qry="select * from user where user_id=? AND password=?";
	ps=con.prepareStatement(qry);
	ps.setString(1,userId);
	ps.setString(2,password);
	rs=ps.executeQuery();
	
	if(rs.next()){
		return true;
	}	
	}
	catch(Exception e){
	System.out.println("failed due to"+e);
	
	}
	return false;
}
}