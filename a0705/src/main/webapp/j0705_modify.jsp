<%@page import="com.java.www.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 정보 수정</title>
	</head>
	<body>
	<%
		// 정보 수정을 하기위해서. 
		// 1. 로그인이 되어있어야함.
		// 2. id > sessionId
		// 3. 이 사람의 모든정보가 필요함.
		// 4. 그 정보를 input box에 넣어주어야 함. 
		String sessionId = (String) session.getAttribute("sessionId");
		MemberDAO mdao = new MemberDAO();
		Member m = mdao.selectMemberOne(sessionId);
	
	%>
		<form action="j0705_modiOk.jsp"  method="get" name="modiFrm">
			<label>이름</label>
			<input type="text" id="name" name="name" value="<%= m.getName() %>"> <br>
			<label>아이디</label>
			<input type="text" id="id" name="id" value="<%= m.getId() %>" readonly> <br>
			<label>비밀번호</label>
			<input type="text" id="pw" name="pw" value="<%= m.getPw() %>"> <br>
			<label>전화번호</label>
			<input type="text" id="phone" name="phone" value="<%= m.getPhone() %>"> <br>
			<br>
			<input type="submit" value="수정">
		</form>
	
	</body>
</html>