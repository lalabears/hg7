<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>가능</title>
	</head>
	<body>
		<h1><%= request.getParameter("name")  %> 님
		    <%= request.getParameter("age")  %> 세로 
		담배, 술 판매 불가능 </h1>
		<a href="j0702_02.jsp">기본페이지로이동</a>
	</body>
</html>