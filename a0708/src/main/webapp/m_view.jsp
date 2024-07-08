<%@page import="com.java.www.MemberDto"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m_view.jsp</title>
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
		<%  // 주소에 아이디값을 함께보냄. 
			String id = request.getParameter("id");
			MemberDao mdao = new MemberDao();
			MemberDto m = mdao.memberOne(id);
		%>
		<div>
			<h1>회원정보보기</h1>
			<table>
				<tr><th>아이디</th><td> <%= m.getId() %> </td></tr>
				<tr><th>비밀번호</th><td> <%= m.getPw() %> </td></tr>
				<tr><th>이름</th><td><%= m.getName() %></td></tr>
				<tr><th>전화번호</th><td> <%= m.getPhone() %> </td></tr>
				<tr><th>성별</th><td> <%= m.getGender() %> </td></tr>
				<tr><th>취미</th><td> <%= m.getHobby() %> </td></tr>
			</table>
			<a href="m_update.jsp?id=<%=m.getId()%>"><button type="button" id="fbtn">회원정보수정</button></a>		
			<a href="m_mlist.jsp"><button type="button">회원정보리스트</button></a>		
		</div>
	
	</body>
</html>