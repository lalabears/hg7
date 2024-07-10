<%@page import="com.java.www.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>mlist.jsp</title>
		<style>
			*{margin: 0; padding: 0; }
			div{width: 400px; margin: 30px auto; text-align:center;}
			h1{margin-bottom: 30px;}
			table, th, td{border: 1px solid black; border-collapse: collapse;
							font-size: 16px;}
			th{width: 200px; height: 40px;}
			td{width: 400px; height: 40px;}
			button{width: 150px; height: 40px; margin-top: 30px;}
		</style>
	</head>
	<body>
		<div>
			<h1> 회원 전체 리스트 </h1>
			<table>
				<tr>
					<th>아이디</th>
					<th>패스워드</th>
					<th>이름</th>
					<th>성별</th>
					<th>가입일</th>
				</tr>
		<c:forEach var="m" items="${list }">
			<tr>
				<td> ${m.getId() }</td>
				<td> ${m.getPw() }</td>
				<td> ${m.getName() }</td>
				<td> ${m.getGender() }</td>
				<td> ${m.getJdate() }</td>
			</tr>	
		</c:forEach>
				
			</table>
		
		</div>
	</body>
</html>