<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>dept.jsp</title>
</head>
<body>
	<table>
		
		<tr>
			<th>Employee Id:</th>
			<th>Department Id:</th>
			<th>DateOfJoining:</th>
			<th>DateOfBirth:</th>
			<th>Salary:</th>
		</tr>
		<c:forEach items="${requestScope.employees}" var="employee">
			<tr>
				<td>${employee.empNum}</td>
				<td>${employee.deptNum}</td>
				<td>${employee.DOJ}</td>
				<td>${employee.DOB}</td>
				<td>${employee.Salary}</td>
			</tr>
		</c:forEach>
	</table>
	<a href='<%=request.getContextPath()%>/logout'>Logout</a>
</body>
</html>