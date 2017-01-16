package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("prodId");
		String name=request.getParameter("prodName");
		
		
		out.println("<h1>product id is :"+id);
		out.println("<h1>product name is :"+name);
		
		
		out.println("<h1><a href=Index.html>Return Page</a></h1>");
	}

}
