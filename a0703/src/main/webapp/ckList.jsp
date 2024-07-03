<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키</title>
		<style type="text/css">
		*{margin: 0; padding:0;}
		h1,th,td{text-align:center;}
		table, th,td {border:1px solid black; border-collapse: collapse; }
		table{width:800px; margin: 30px auto;}
		th,td{width:200px; height: 40px;}
		</style>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
		$(function(){
			$("#fbtn").click(function(){
				// alert( $("#co_name").val() );
				var result = confirm("정말로 삭제하시겠습니까 ? ")
				if(result){
					ckFrm.submit(); // form 전송 
				}
			});//fbtn
		});// jquery
		</script>		
	</head>
	<body>
		<h1>쿠키리스트</h1>
		<table>
			<tr>
				<th>번호</th>
				<th>쿠키이름</th>
				<th>쿠키값</th>
				<th>유효시간</th>
			</tr>
			<%	
				Cookie[] cks = request.getCookies();
				if(cks!=null){
					for(int i = 0; i<cks.length;i++){
			%>
			<tr>
				<td> <%= i+1 %>  </td>
				<td> <%= cks[i].getName() %>  </td>
				<td> <%= cks[i].getValue() %>  </td>
				<td> <%= cks[i].getMaxAge() %>  </td>
			</tr>
			<% 			
					} // for
				} // if
			%>			
		</table>
		
		<button onclick="javascript:location.href='ckWrite.jsp'">쿠키생성</button>
		<br><hr>
		<h1>쿠키 삭제</h1>
		<form action="ckDoDelete.jsp" method="post" name="ckFrm">
			<label>쿠키 이름</label>
			<input type="text" name="co_name" id="co_name">
			
			<input type="button" id="fbtn" value="쿠키삭제">
			<br>
		</form>
		
		
		
	
	</body>
</html>