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
		<h2>Board출력하기</h2>
		<h3> ${board.getBno() }  </h3>
		<h3> ${board.getId() }  </h3>
		<h3> ${board.getBtitle() }  </h3>
		
		<h2> List 출력하기 </h2>
		<c:forEach var="b" items="${list }">
			<h3> ${b.getBno() }  </h3>
			<h3> ${b.getId() }  </h3>
			<h3> ${b.getBtitle() }  </h3>
		</c:forEach>
		
		
		
	
	</body>
</html>