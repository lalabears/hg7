<%@page import="com.java.www.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<%
		request.setCharacterEncoding("utf-8");
		// 1. 읽어온 값 출력하기 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		MemberDAO mdao = new MemberDAO();
		// 성공은 1 실패는 0 
		int result = mdao.updateMember(new Member(name,id,pw,phone));
	%>
		<script>
			if( <%= result %> == 1){
				alert("회원정보가 수정되었습니다.");
				location.href = "j0705_main.jsp";
			}else{
				alert("데이터가 올바르지 않습니다.");
				location.href = "j0705_main.jsp";
			}
		</script>
	
	
	
	</body>
</html>