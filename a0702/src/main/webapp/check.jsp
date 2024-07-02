<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>check</title>
	</head>
	<body>
		<%	String id = request.getParameter("id");
			String name = request.getParameter("name");
			
			// String[] interest = request.getParameterValues("interest");

			if( id.equals("aaa") || id.equals("bbb") ){
		%>
			<script>
				alert("이미존재하는 아이디 입니다! 다시 입력해주세요 ");
				location.href = "join02_info_input.jsp";
			</script>
		<% 
				//response.sendRedirect("join02_info_input.jsp");
		
			}else{
				
				// 아이디가 데이터베이스에 없으면. 
				// 가입완료되었습니다 페이지로 넘기기
				// redirect 주소에 한글을 보낼때 오류없이 보내기 위해서는
				// url 인코더를 사용해야함. 
				String n = java.net.URLEncoder.encode(name);
				response.sendRedirect("join03_success.jsp?id="+id+"&name="+n);
			}
		%>
		
	</body>
</html>