package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloController
 */
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 public HelloController() {
	       System.out.println("it is the ctr of servlet");
	    }
	 
	@Override
	public void init() throws ServletException {
		System.out.println("it is the init method of servlet");
	}
   
   


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("it is doGet()");
	}


	@Override
	public void destroy() {
		System.out.println("it is the destroy method of servlet");
	}

}
