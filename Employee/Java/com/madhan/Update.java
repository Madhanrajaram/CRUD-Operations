package com.madhan;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Emp
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/user";
		String sql="update user.employeeinfo set FirstName=?,LastName=?,Address=?,MobileNo=? where EmployeeId=?";
		int id=Integer.parseInt(request.getParameter("id"));
		String fn=request.getParameter("efirst1");
		String ln=request.getParameter("elast1");
		String add=request.getParameter("eadd1");
		String mob=request.getParameter("eno1");
			try {
				  Connection con3=null;
				  PreparedStatement pst3=null;
			      try {
						Class.forName(driver);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					   con3=DriverManager.getConnection(url,"root","password");
					   pst3=con3.prepareStatement(sql);
					   pst3.setString(1,fn);
					   pst3.setString(2,ln);
					   pst3.setString(3,add);
					   pst3.setString(4,mob);
					   pst3.setInt(5,id);
					   pst3.executeUpdate();  			   
		               response.sendRedirect("index.jsp");	
					   con3.close();
			}
					   
			catch (SQLException e) {
				e.printStackTrace();
				}
		
	}

}
