<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인페이지</title>
	</head>
	<body>
	<%--  페이지를 이동시키는 방법 	
	 1. <% response.sendRedirect("sub.jsp"); %> 
	 2. <script>location.href = "sub.jsp"; </script>
	 
	 3. <jsp:forward> 는 다른페이지로 전환할때 사용함. 
	    주소가 바뀌지 않음. > 주로 페이지 리뉴얼시 사용함
		<jsp:forward page="sub.jsp">
			<jsp:param name="id" value="abcd" />
			<jsp:param name="pw" value="1234" />		
		</jsp:forward>
	 --%>
	 <h1> 여기는 메인페이지 입니다 </h1>
	 <%-- include는 jsp안에jsp를 삽입하는 형태  
	 <%@ include file = "sub.jsp" %> --%>
		
	 <jsp:include page="sub.jsp">
		<jsp:param name="id" value="abcd" />
		<jsp:param name="pw" value="1234" />		
	 </jsp:include>
		
	
	</body>
</html>