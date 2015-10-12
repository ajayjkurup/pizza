<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>List of Employees</h2>	
	<table>
		<tr>
			<td>NAME</td><td>Type</td><td>price</td><td>description</td><td></td>
		</tr>
		<c:forEach items="${items}" var="item">
			<tr>
			<td>${item.name}</td>
			<td>${item.type}</td>
			<td>${item.price}</td>
			<td>${item.description}</td>
			<td><a href="<c:url value='/edit-${item.id}-item' />">edit</a></td>
			<td><a href="<c:url value='/delete-${item.id}-item' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>