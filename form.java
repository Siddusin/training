package com.te.feshlite03.j2ee.assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class form
 */
@WebServlet("/form")
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		 ArrayList<String> parameterNames = new ArrayList<String>();
		 Enumeration enumeration = request.getParameterNames();
		    while (enumeration.hasMoreElements()) {
		        String parameterName = (String) enumeration.nextElement();
		        parameterNames.add(parameterName);
		        System.out.println(parameterName);
		    }
		    for (String string : parameterNames) {
				response.getWriter().println(string);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		 ArrayList<String> parameterNames = new ArrayList<String>();
		 Enumeration enumeration = request.getParameterNames();
	     PrintWriter writer = response.getWriter();
		    while (enumeration.hasMoreElements()) {
		        String parameterName = (String) enumeration.nextElement();
		        parameterNames.add(parameterName);
		   
		        writer.println(parameterName);
		    }
		    String[] parameterValues = request.getParameterValues("num");
		     for(int i=0;i<parameterValues.length;i++) {
		    	 writer.println(parameterValues[i]);
		     }
	}

}
