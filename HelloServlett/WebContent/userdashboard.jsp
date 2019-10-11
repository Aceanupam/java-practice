<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Dashboard</title>
</head>
<body>
User Dashboard
<table border=2>
<c:if test="${customer ne null}">
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Mobile</th>
	</tr>
	<tr>
		<td>${customer.id}</td>
		<td>${customer.firstName }</td>
		<td>${customer.lastName}</td>
		<td>${customer.email}</td>
		<td>${customer.mobile}</td>
	</tr>
	</c:if>
</table>
</body>
</html>