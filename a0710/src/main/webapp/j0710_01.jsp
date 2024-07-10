<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL</title>
	</head>
	<body>

	
		<%
			out.print(10);
			out.print("<br>");
			out.print(11+12);
		%>
		<hr>
		<%= 11+12 %>
		<hr>
		${10}<br>
		${11+12}<br>
		${11*20}<br>
		<hr>
		<%= request.getParameter("id") %><br>
		${param.id} <br>
		<hr>
		<%= session.getAttribute("sessionId") %> <br>
		${sessionScope.sessionId }<br>
		${sessionId}
		<hr>
		el 태그는 다른페이지로부터 넘겨받을때만 사용이 가능함. 
		스크립트문 안에서 호환은되지 않는다. 
	<%-- 	<% if( ${sessionId} == null ) %> --%>
		
		
		
		
		
		
		
	</body>
</html>