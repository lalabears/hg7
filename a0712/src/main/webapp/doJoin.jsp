<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doDelete.jsp</title>
	</head>
	<body>
	
		<c:if test="${result == 1 }">
			<script>
				alert("회원가입이 되었습니다");
				location.href= "main.do";
			</script>
		</c:if>
	
	</body>
</html>