<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>emp.jsp</title>
</head>
<body>
<table>
		<tr>
			<td>Employee Id:</td>
			<td>${requestScope.emp.empNum}</td>
		</tr>
		<tr>
			<td>Department Id:</td>
			<td>${requestScope.emp.deptNum}</td>
		</tr>
		<tr>
			<td>DateOfJoining</td>
			<td>${requestScope.emp.dOJ}</td>
		</tr>
		<tr>
			<td>DateOfBirth</td>
			<td>${requestScope.emp.dOB}</td>
		</tr>
		<tr>
			<td>Salary</td>
			<td>${requestScope.emp.salary}</td>
		</tr>
	</table>
	
	<a href='<%=request.getContextPath() %>/logout'>Logout</a>
</body>
</html>