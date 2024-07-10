<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		
		<h2> Member List 출력하기 </h2>
		<c:forEach var="m" items="${list }">
			<h3> ${m.getId() }  </h3>
			<h3> ${m.getPw() }  </h3>
			<h3> ${m.getName() }  </h3>
		</c:forEach>
		
		
		
	
	</body>
</html>