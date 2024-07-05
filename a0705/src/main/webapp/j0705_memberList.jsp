<%@page import="com.java.www.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보리스트</title>
		<style>
		table, th, td {border: 1px solid black; border-collapse: collapse;
						text-align: center; }
		th, td{width : 200px; height: 40px;}
		</style>
	</head>
	<body>
		<h2>회원정보리스트</h2>	
		<table>
			<tr> 
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>전화번호</th>
			</tr>
		<%	String id, pw, name, phone;
			MemberDAO mdao = new MemberDAO();
			ArrayList<Member> list = mdao.selectMember();
			for( int i = 0 ; i<list.size(); i++ ){
				Member m = list.get(i);
				id = m.getId();
				pw = m.getPw();
				name = m.getName();
				phone = m.getPhone();
		%>
			<tr>
				<td><%= id %></td>
				<td><%= pw %></td>
				<td><%= name %></td>
				<td><%= phone %></td>
			</tr>
		<% } %>	
		</table>
	</body>
</html>