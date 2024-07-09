<%@page import="com.java.www.Member"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인확인</title>
	</head>
	<body>
		<%	
			request.setCharacterEncoding("utf-8");
			String uid = request.getParameter("id");
			String upw = request.getParameter("pw");
			// out.print(uid+upw);  // 확인용
			
			// db랑 연결을 하기위해서 메서드가 있는 dao클래스 객체 생성 
			MemberDao mdao = new MemberDao(); 
			Member m = mdao.selectLogin(uid, upw);
			
			if(m!=null){
				// db에 정보가 있어서 로그인되었다. 
				session.setAttribute("sessionId", m.getId());
		%>
			<script>
				alert("로그인되었습니다");
				location.href="main.jsp";
			</script>
		<%	}else{ 		%>
			<script>
				alert("잘못입력하셨습니다. 다시시도해주세요");
				location.href="login.jsp";
			</script>
		<%	} %>
	
	</body>
</html>