package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		SecondPojo sp=new SecondPojo();
		sp.setUserId(request.getParameter("userId"));
		sp.setPassword(request.getParameter("password"));
		sp.setFirstname(request.getParameter("firstname"));
		sp.setLastname(request.getParameter("lastname"));
		sp.setDob(request.getParameter("dob"));
		
			DataBase db=new  DataBase();
			
			boolean status=db.Register(sp);

			if (status) {
				out.println("<h1>Record saved to database</h1>");
			} else {
				out.println("some issue");
			}

			out.println("<h3><a href='index.html'>Click here for NewRegisteration</a></h3>");

	
		}

}
