<%@page import="com.java.www.Member"%>
<%@page import="com.java.www.MemberDao"%>
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
			// 1. 회원가입 내용 다 전달받아 출력해보기 
			String id = request.getParameter("uid");
			String pw = request.getParameter("upw");
			String name = request.getParameter("uname");
			String phone = request.getParameter("phone");
			String gender = request.getParameter("gender");
			String[] hobby = request.getParameterValues("hobby");
			String hobbys = "";
			for(int i =0 ; i <hobby.length;i++){
				if(i==0) hobbys+= hobby[i];
				else hobbys+=","+hobby[i];
			}
			
			// 2. 전달받은 내용으로 멤버객체 만들기 
			Member mem = new Member(id,pw,name,phone,gender,hobbys);
			// 3. 멤버Dao에 insert메서드 만들기
			MemberDao mdao = new MemberDao();
			int result = mdao.insertOne(mem);
			if( result == 1 ){
				// 성공하면
			%>
			<script>
				alert("성공!");
				location.href="index.jsp";
			</script> 
			<% }else{%>
			<script>
				alert("실패!");
				location.href="mwrite.jsp";
			</script> 
			<%}%>
			
			
	
	</body>
</html>