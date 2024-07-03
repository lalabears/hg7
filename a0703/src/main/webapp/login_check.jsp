<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login_check.jsp</title>
	</head>
	<body>
	  <%
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    
	    // 이부분은 추후에 db에 있는 정보랑 비교할 예정임 
	    if(id.equals("aaa") && pw.equals("1111")){
	    	session.setAttribute("sessionId", id);
	    	session.setAttribute("sessionName","홍시");
	    	response.sendRedirect("main.jsp");
	    }else{
	    	response.sendRedirect("login.jsp?loginCheck=0");
	    }
	  
	  %>
	  <!--  html -->
	  <a href="main.jsp">메인가기</a>
	  <!-- javascript -->
	  <script>
	  	location.href = "main.jsp";
	  </script>
	
	</body>
</html>