<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doModi.jsp</title>
	</head>
	<body>
		<c:if test="${result==1 }">
			<script type="text/javascript">
				alert("게시글이 수정되었습니다");
				location.href="board.do";
			</script>
		</c:if>
	
	</body>
</html>