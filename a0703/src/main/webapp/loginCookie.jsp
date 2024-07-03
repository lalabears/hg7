<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인쿠키</title>
	</head>
	<body>
	<%
	  // 아이디, 비밀번호 값 가져오기
	   String id = request.getParameter("id");
	   String pw = request.getParameter("pw");
	   // 쿠키 생성 
	   Cookie ck1 = new Cookie("cid", id);
	   Cookie ck2 = new Cookie("cpw", pw);
	   // 쿠키 시간설정
	   ck1.setMaxAge(60);
	   ck2.setMaxAge(60);
	   // 컴퓨터에 저장 
	   response.addCookie(ck1);
	   response.addCookie(ck2);
	   
	%>
	
	<a href="login.jsp"> 로그인페이지로가기 </a>
	
	</body>
</html>