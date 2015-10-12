<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store View</title>
</head>
<body>
<h2>List of Store</h2>	
	<table border="1">
		<tr>
			<td>Store Name</td><td> Admin Id</td> <td> License </td><td>Address</td><td>Phone number</td>
		</tr>
		<c:forEach items="${store}" var="store">	
			<tr>
			<!-- <td>${store.id}</td> -->
			<td>${store.name}</td>
			<td>${store.admin_id}</td>
			<td>${store.license}</td>
			<td>${store.address}</td>
			<td>${store.phone_number}</td>
			
			<td><a href="<c:url value='/edit-${store.id}-store' />">Edit</a></td>
			<td><a href="<c:url value='/delete-${store.id}-store' />">Delete</a></td>
			
			</tr>
		</c:forEach>
	</table>
	<br/>
	<br/>
	<a href="<c:url value='/newstore' />">Add New Store *</a>
</body>
</html>