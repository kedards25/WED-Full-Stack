package com.learning.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")	//configuring the servlet with url using annotations
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		out.println("Hello World from doGet method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Instead of writing the code two times in doGet and doPost
		//we are invoking doGet  from the body of doPost
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		out.println("Hello World from doPost method");
	}
	

}













