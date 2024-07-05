<%@page import="com.java.www.*"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<% request.setCharacterEncoding("utf-8"); //post에서한글깨짐없음
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		//객체 선언 
		MemberDAO mdao = new MemberDAO();
		//String name, String id, String pw, String phone
		int result = mdao.insertMember(new Member(name, id, pw, phone));
		// 성공 : 1 실패 : 0 
		%>
		<script>
			if( <%= result%> == 1){
				alert("저장완료!!!");
				location.href = "j0705_main.jsp";
			}else{
				alert("데이터가 올바르지 않습니다. 다시입력해주세요 ");
				history.back();
			}
		</script>
	
	</body>
</html>