<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST"  modelAttribute="store" >
<form:input type="hidden" path="id" id="id"/>
<table align="center" border='1' cellpadding="10" ;">
<tr>
<td> <font color="black"> Store Name  </font> </td> <td> <form:input  path="name" id ="name" required ="true"/> </td> 
</tr>
<tr>
<td> <font color="black"> Admin id  </font> </td> <td> <form:input  path="admin_id" id="admin_id" required ="true"/> </td> 
</tr>
<tr>
<td> <font color="black"> License </font> </td> <td> <form:input  path="license"  id="license" required ="true"/> </td> 
</tr>
<tr>
<td> <font color="black"> Address </font> </td><td> <form:textarea  rows="5" cols="23" path="address" id="address" required="true"></form:textarea> </td> 
</tr>
<tr>
<td> <font color="black"> Phone Number </font> </td> <td> <form:input type="tel" path="phone_number" id="phone_number"  required ="true" /> </td> 
</tr>
<tr>
<td>
</td>
<td>
<c:choose>
<c:when test="${edit}">
<input type="submit" value="Update" style="width:100px;height:30px;"/>
</c:when>
<c:otherwise>
<input type="submit" value="Register" style="width:100px;height:30px;"/>
</c:otherwise>
</c:choose>
</td>
</tr>
</table>

</form:form>
</body>
</html>