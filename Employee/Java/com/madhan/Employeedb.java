package com.madhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employeedb {
public String add(Employee em)
{
	String driver1="com.mysql.jdbc.Driver";
	 String url="jdbc:mysql://localhost:3306/user";
	 String sql1="insert into user.employeeinfo values(?,?,?,?,?)";
	try
	{
		Connection con1=null;
		PreparedStatement pst1=null;
	   String to="done";
	   try {
		Class.forName(driver1);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	   con1=DriverManager.getConnection(url,"root","password");
	   pst1=con1.prepareStatement(sql1);
	   pst1.setInt(1,em.getId());
	   pst1.setString(2,em.getFname());
	   pst1.setString(3,em.getLname());
	   pst1.setString(4,em.getAdd());
	   pst1.setString(5,em.getNo());
	   pst1.executeUpdate();
	   return to;
	}
	catch(SQLException e) {
		return "Invalid Input";
	}
}
}
