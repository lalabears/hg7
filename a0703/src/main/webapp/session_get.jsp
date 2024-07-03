<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션읽어오기</title>
		<style type="text/css">
		table{width: 400px; margin: 0 auto; text-align: center; }
		table, td{border: 1px solid black; border-collapse: collapse;}
		td{width:200px; height: 40px;}
		</style>
	</head>
	<body>
		<%
			// 세션에 저장하면 자동으로 오브젝트타입으로 변환되어 저장됨.
			// 문자열로저장하고 싶을 경우에는 반드시 형 변환을 해주어야한다. 
			String sessionId =(String)session.getAttribute("sessionId");
			String sessionNicName =(String)session.getAttribute("sessionNicName");
			String sessionName =(String)session.getAttribute("sessionName");
		%>		 
		 <table>
		 	<tr>
		 		<td>sessionId</td>       <td>  <%= sessionId %>  </td>
		 	</tr>
		 	<tr>
		 		<td>sessionNicName</td>  <td>  <%= sessionNicName %> </td>
		 	</tr>
		 	<tr>
		 		<td>sessionName</td>      <td>  <%= sessionName %>  </td>
		 	</tr>
		 </table>
		
		<!--   페이지를 새로고침해도, get페이지만 열어도 세션이 남아 있는것을 확인 할 수 있다.
			   서버를 멈췃다 다시 키거나. 모든 브라우져를 다 닫앗다고 다시 get파일을 실행시키면
			   세션이 다 사라져서 null로 출력되는것을 확인할 수 있음.. 
			   
			   로그아웃을 할경우에 세션정보를 다 삭제해야함. 	
		 -->
		 <% // 세션 하나씩 삭제하기 
		    // session.removeAttribute(세션이름);
		 	session.removeAttribute("sessionId");
		    // 세션 한번에 다 지우기 
		    session.invalidate();
		 %>
		
		
		
		
	
	</body>
</html>