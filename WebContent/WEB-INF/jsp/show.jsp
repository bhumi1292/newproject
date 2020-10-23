<%@page import="com.model.Person"%>
<%@page import="java.util.List"%>
<%@page import="com.Bo.PersonBo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	ApplicationContext con= new ClassPathXmlApplicationContext("beans.xml");
PersonBo pbo= (PersonBo)con.getBean("personBo");
List<com.model.Person> list = pbo.getall();
%>
		<table border="1" width="100%">
		<!-- <!-- <tr>
		<td>ID/td>
		<td><th>NAME</th></td>
		<td><th>ADDRESS</th>
		<td><th>EDIT</th>
		<td><th>DELETE</th>
		</tr> --> 
		
		<tr>
		<td>ID</td>
		<td>Person Name</td>
		<td>Person Address</td>
		<td>Edit</td>
		<td>Delete</td>
		
		</tr>
		<%
			for(com.model.Person p:list)
				{
		%>
		
		<tr>
		<td><%= p.getId() %></td>
		<td><%= p.getName()%></td>
		<td><%= p.getAddress() %></td>
		
		<td>
		<form name="edit" method="post" action="edit">
			<input type="hidden" name="id" value="<%=p.getId()%>">
			<input type="submit" name="action" value="Edit"> 
		</form>
		</td>
		
		<td>
		<form name="delete" method="post" action="delete">
			<input type="hidden" name="id" value="<%=p.getId()%>">
			<input type="submit" name="action" value="Delete"> 
		</form>
		</td>
		</tr>
		
		<%
		} 
		%>
		
		
		</table>
<a href="insert1">Add New Person</a>
<p>success</p>
</body>
</html>