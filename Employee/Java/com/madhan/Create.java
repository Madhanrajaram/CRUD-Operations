package com.madhan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Create
 */
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid=Integer.parseInt(request.getParameter("eidd"));
		String efirst=request.getParameter("efirst");
		String elast=request.getParameter("elast");
		String eadd=request.getParameter("eadd");
		String eno=request.getParameter("eno");
		Employee e=new Employee(eid,efirst,elast,eadd,eno);
		Employeedb ed = new Employeedb();
		if(ed.add(e).equalsIgnoreCase("done"))
		{
		response.sendRedirect("index.jsp");
	}
		else
		{
			response.sendRedirect("Create.jsp");
		}

	}
}
