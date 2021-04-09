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
 * Servlet implementation class Delete
 */
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/user";
		String sql="delete from user.employeeinfo where EmployeeId=?";
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			  Connection con4=null;
			  PreparedStatement pst4=null;
		      try {
					Class.forName(driver);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				   con4=DriverManager.getConnection(url,"root","password");
				   pst4=con4.prepareStatement(sql);
				   pst4.setInt(1, id);
				   pst4.executeUpdate();
				   response.sendRedirect("index.jsp");
		           con4.close();
	}
		catch (SQLException e) {
			e.printStackTrace();
			}
	
}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
