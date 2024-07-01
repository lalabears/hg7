<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적표</title>
		<style type="text/css">
		*{padding : 0; margin: 0; }
		table, td,th{width: 800px; border: 1px solid black; border-collapse: collapse;
				text-align : center; margin: 30px auto;
		}
		th{height: 40px; background: #efefef; }
		td{height: 35px; width: 150px;}
		</style>
		
	</head>
	<body>
		<h2>학생성적 관리 시스템</h2>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
					<th>총점</th>
					<th>평균</th>
				</tr>
			</thead>
			<tbody>
			<%-- 1. 똑같이 10번 반복해서 출력해보세요  
				2. String[] name={"홍길동","유관순","이순신","서태웅","김구","강백호"}
				   int[] kor = {100, 90, 82, 74, 99, 87}
				   int[] eng = {90, 88, 80, 95, 98, 79}
				   int[] math= {85, 100, 87, 99, 82, 80}		
		    --%>
			<% 
			   String[] name={"홍길동","유관순","이순신","서태웅","김구","강백호"};
			   int[] kor = {100, 90, 82, 74, 99, 87};
			   int[] eng = {90, 88, 80, 95, 98, 79};
			   int[] math= {85, 100, 87, 99, 82, 80};
			   for(int i = 0; i < name.length ; i++ ) { 
			%>
				<tr>
					<td> <%= i+1 %> </td>
					<td> <%= name[i] %> </td>
					<td> <%= kor[i] %> </td>
					<td> <%= eng[i] %> </td>
					<td> <%= math[i] %> </td>
					<td> <%= kor[i]+eng[i]+math[i] %> </td>
					<td> <%= (kor[i]+eng[i]+math[i])/3 %> </td>
				</tr>
			<% }   %>
			</tbody>
		</table>
	
	</body>
</html>