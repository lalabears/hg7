<%@page import="com.java.www.MemberDto"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m_update.jsp</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
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
		<script>
		$(function(){
			$("#fbtn").click(function(){
				alert("회원정보를 수정합니다")
				m_frm.submit();
			});//fbtn
		});//jquery
		</script>
	</head>
	<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		MemberDao mdao = new MemberDao();
		MemberDto m = mdao.memberOne(id);
	%>
		<div>
			<h1>회원정보수정_관리자가 접속</h1>
			<form action="M_update" name="m_frm" method="post">
			<table>
				<tr>
					<th>아이디</th>
					<td> <%= m.getId() %>
						<input type="hidden" id="uid" name="uid" value="<%= m.getId() %>">
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" id="upw" name="upw"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td>
						<input type="text" id="uname" name="uname" value="<%= m.getName() %>" readonly>
					</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" id="phone" name="phone" value="<%= m.getPhone() %>"></td>
				</tr>
				<tr>
					<th>성별</th>
					<td>
						<input type="radio" id="Male" name="gender" value="Male" 
						<%  if(m.getGender().equals("Male")) out.print("checked");  %>	>
						<label for="Male">남성</label>
						<input type="radio" id="Female" name="gender" value="Female"
						<%  if(m.getGender().equals("Female")) out.print("checked");  %>>
						<label for="Female">여성</label>
					</td>
				</tr>
				<tr>
					<th>취미</th>
					<td>
						<input type="checkbox" name="hobby" id="game" value="game"
						<%  if(m.getHobby().contains("game")) out.print("checked");  %>	>
						<label for="game">게임</label>
						<input type="checkbox" name="hobby" id="golf" value="golf"
						<%  if(m.getHobby().contains("golf")) out.print("checked");  %> >
						<label for="golf">골프</label>
						<input type="checkbox" name="hobby" id="run" value="run"
						<%  if(m.getHobby().contains("run")) out.print("checked");  %>>
						<label for="run">조깅</label>
						<input type="checkbox" name="hobby" id="cook" value="cook"
						<%  if(m.getHobby().contains("cook")) out.print("checked");  %>>
						<label for="cook">요리</label>
						<input type="checkbox" name="hobby" id="book" value="book"
						<%  if(m.getHobby().contains("book")) out.print("checked");  %>>
						<label for="book">독서</label>
					</td>
				</tr>
			</table>
			
			<button type="button" id="fbtn">수정</button>
			<button type="button" onclick="javascript:history.back()">취소</button>
			</form>	
		</div>
	</body>
</html>