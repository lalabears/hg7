<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키삭제</title>
	</head>
	<body>
		<%
			String cname = request.getParameter("co_name");
			Cookie[] cks = request.getCookies();
			int check=0; // check=0일땐 쿠키가 없음
			if(cks!=null){
				for(int i = 0; i< cks.length;i++){
					if(cks[i].getName().equals(cname)){
						cks[i].setMaxAge(0);
						response.addCookie(cks[i]);
						check=1; // 쿠키가 존재함
					}
				} // 쿠키배열 for문 
			}// if문 
			if(check==0){
		%>
			<script>
				alert("입력하신 쿠키를 찾을 수 없습니다.");
				location.href="ckList.jsp";
			</script>
		<%  } else {  %>
			<script>
				alert("쿠키를 삭제하였습니다.");
				location.href="ckList.jsp";
			</script>
		<% 	} // check-else-if문 닫는괄호   %>
	
	</body>
</html>