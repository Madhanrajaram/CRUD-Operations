<%@ page import="java.sql.Connection,java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet,java.sql.SQLException"
	language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/user";
String sql="select * from user.employeeinfo";	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Page</title>
</head>
<body>
	<h2 align="center">Employee Details</h2>
	<br>
	<Form style="text-align: right;" action="Create.jsp" method="post">
	<input type="submit" value="+AddEmployee">
	</Form>
	<br>
	<table cellpadding="3" align = "center" border="1">
		<tr>
			<th>EmployeeId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Address</th>
			<th>MobileNo</th>
		</tr>
		<%
	  try {
		  Connection con=null;
		  PreparedStatement pst;
	      try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			   con=DriverManager.getConnection(url,"root","password");
			   pst=con.prepareStatement(sql);
			   ResultSet rs=pst.executeQuery();  
			   while(rs.next())
			   {
				   int i=rs.getInt(1);
%>
		<tr> 
			<td><%=rs.getInt(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td>
			<a href="Update.jsp?id=<%=i%>">Update</a>
			</td>
			<td><a href="Delete?id=<%=i%>">Delete</a></td>
		</tr>
		<%
			}
			   con.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		%>
	</table>
		</body>
		</html>	