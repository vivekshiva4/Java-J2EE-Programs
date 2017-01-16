package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String user=request.getParameter("userId");
		String pwd=request.getParameter("password");
		
		
		
		LoginDb db=new LoginDb();
		boolean status=db.validateUser(user, pwd);
		if(status)
		{
			response.sendRedirect("welcome");
		}
		else{
			response.sendRedirect("Login.html");
		
		}
}
}