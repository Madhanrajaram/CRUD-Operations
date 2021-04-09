<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<form action="Create" method="post">
<sup>*</sup>Enter EmployeeId: &nbsp<input type="text" name="eidd" required/><br>
<br>
<sup>*</sup>Enter Firstname: &nbsp&nbsp&nbsp&nbsp<input type="text" name="efirst" required/><br>
<br>
<sup>*</sup>Enter Lastname: &nbsp&nbsp&nbsp&nbsp<input type="text" name="elast" required/><br>
<br>
<sup>*</sup>Enter Address: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="eadd" required/><br>
<br>
<sup>*</sup>Enter MobileNo: &nbsp&nbsp&nbsp&nbsp<input type="number" name="eno" required/><br>
<br>
<br>
<br>
<br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="AddEmployee">

</form>
</body>
</html>