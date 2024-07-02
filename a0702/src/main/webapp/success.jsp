<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>가능</title>
	</head>
	<body>
		<h1>담배, 술 판매가 가능합니다. </h1>
		<h2>현재나이 : <%= request.getParameter("age")  %></h2>
		<h2>이름 :  <%= request.getParameter("name")  %> </h2>
		<a href="j0702_02.jsp">기본페이지로이동</a>
	</body>
</html>