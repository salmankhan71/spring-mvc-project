<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home</h1>
	<h1>url /home</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> sa = (List<String>) request.getAttribute("f");
	%>
	<h1>
		Name is
		<%=name%></h1>
		
		<h1>
		Id id
		<%=id %></h1>
		
		<%
		for(String s:sa){
		%>
		<h1><%=s %></h1>
		<%
		}
		%>

</body>
</html>