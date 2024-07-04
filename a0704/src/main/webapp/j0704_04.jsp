<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>일반적인방법</title>
		<style>
		table{width: 400px; margin: 30px auto; text-align:center;}
		table, td{border: 1px solid black; border-collapse: collapse;}
		td{width: 200px; height: 40px;}
		</style>
	</head>
	<body>
		<% request.setCharacterEncoding("utf-8"); // post방식에서 한글안깨지기 %>
		<table>
			<tr>
				<td>아이디</td>
				<td><%= request.getParameter("memId") %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= request.getParameter("memName") %></td>
			</tr>
		</table>
	
	</body>
</html>