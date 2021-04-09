<%@ page import="java.sql.Connection,java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet,java.sql.SQLException"
	language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/user";
String sql="select * from user.employeeinfo where EmployeeID=?";	
int id=Integer.parseInt(request.getParameter("id"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updation</title>
</head>
<body>
    <h2 align="center">Update Employee</h2>
    <br>
    <form action="Update?id=<%=id%>" method="post">
    <%  try {
		  Connection con2=null;
		  PreparedStatement pst2=null;
	      try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			   con2=DriverManager.getConnection(url,"root","password");
			   pst2=con2.prepareStatement(sql); 
			   pst2.setInt(1,id);
			   ResultSet rs2=pst2.executeQuery(); 
			   while(rs2.next())
			   {
			   %>	
Firstname: &nbsp&nbsp&nbsp&nbsp<input type="text" name="efirst1" value="<%=rs2.getString(2)%>" required/><br>
<br>
Lastname: &nbsp&nbsp&nbsp&nbsp<input type="text" name="elast1" value="<%=rs2.getString(3)%>" required/><br>
<br>
Address: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="eadd1" value="<%=rs2.getString(4)%>" required/><br>
<br>
MobileNo:&nbsp&nbsp&nbsp&nbsp<input type="text" name="eno1" value="<%=rs2.getString(5)%>" required/><br>
<br>
<br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="Submit">
<%	}
			   con2.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
    %>
</form>
</body>
</html>