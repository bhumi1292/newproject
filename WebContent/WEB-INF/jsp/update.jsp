<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" name="insert" method="post">	
	<table border="1" width="100%">
		<tr>
		<td><input type="hidden" name="id" value="${p.id}"></td>
		</tr>
		<tr>
		<td>Person Name</td>
		<td><input type="text" name="name" value="${p.name}"></td>
		</tr>
		
		<tr>
		<td>Person Address</td>
		<td><input type="text" name="address" value="${p.address}">
		</td>
		</tr>
	
	<tr>
	<td colspan="2" align="center">
	<input type="submit" value="update" name="action">
	</td>
	</tr>
	
	
	</table>


</form>
<a href="show.jsp">Show Data</a>
</body>
</html>