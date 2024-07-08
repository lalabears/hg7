<%@page import="com.java.www.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m_mlist.jsp</title>
		<% if(session.getAttribute("session_id")==null){  %>
		<script>
			alert("로그인하셔야 접근가능합니다");
			location.href="m_main.jsp";
		</script>
		<%} %>
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
		<%
			MemberDao  mdao = new MemberDao();
			ArrayList<MemberDto> list = mdao.memberAll();
			MemberDto mdto= null; 
			for(int i = 0 ; i < list.size(); i++ ){
				mdto = list.get(i);
		%>
				<tr>
					<td><%= mdto.getId() %></td>
					<td><%= mdto.getPw() %></td>
					<td><a href="m_view.jsp?id=<%= mdto.getId() %>"><%= mdto.getName() %></a></td>
					<td><%= mdto.getGender() %></td>
					<td><%= mdto.getJdate() %></td>
				</tr>
		<% }  // for문을 닫는 괄호 %>	
					
			
			</table>
		
		
		
		
		
		
		</div>
	
	
	
	
		
	</body>
</html>