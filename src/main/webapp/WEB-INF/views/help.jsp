<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>this is help page</title>
</head>
<body>
	<%
	/* String names = (String) request.getAttribute("names");
	Integer rollnumber = (Integer) request.getAttribute("rollnumber");
	LocalDateTime time= (LocalDateTime)request.getAttribute("time"); */
	%>

	<h1>
		My name is
		<%-- <%=names%></h1> --%>
		${names}
	</h1>
	<h1>This is help page</h1>
	<h1>
		my rollnumber is
		<%-- <%=rollnumber%> --%>
		${rollnumber }
	</h1>

	<h1>
		Date and Time is
		<%-- <%=time.toString() %> --%>
		${time }
	</h1>
	<hr>
	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>
	</c:forEach>
</body>
</html>