<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>javaBean사용</title>
		<style>
		table{width: 400px; margin: 30px auto; text-align:center;}
		table, td{border: 1px solid black; border-collapse: collapse;}
		td{width: 200px; height: 40px;}
		</style>
	</head>
	<body>
		<% request.setCharacterEncoding("utf-8"); // post방식에서 한글안깨지기 %>
		<jsp:useBean id="member" class="com.java.www.Member"/>
		<jsp:setProperty property="*" name="member"/>
		<table>
			<tr>
				<td>아이디</td>
				<td><%= member.getMemId() %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= member.getMemName() %></td>
			</tr>
		</table>
	
	</body>
</html>