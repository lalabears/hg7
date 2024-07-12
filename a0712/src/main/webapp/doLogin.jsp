<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>dologin</title>
	</head>
	<body>
		<c:if test="${member != null }">
			<script type="text/javascript">
				alert("로그인되었습니다");
				location.href="main.do";
			</script>
		</c:if>
	
	</body>
</html>