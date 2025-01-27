package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Integer x=Integer.parseInt(request.getParameter("x"));
		Integer y=Integer.parseInt(request.getParameter("y"));
		Integer sum=x+y;
		PrintWriter out=response.getWriter();
		out.print("value is "+sum+"<br/>");
		
	}


}
