<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적프로그램</title>
		<style type="text/css">
		table,td{border: 1px solid black; border-collapse: collapse; 
		         font-size: 16px; text-align: center; }
		td{width:150px; height: 40px;}
		</style>
	</head>
	<body>
		<h1>학생성적프로그램</h1>
	<!--     request.getParameter를 사용해서 전달받은 값들을 출력해보세요 j0704_04 참고 -->
		<%
			request.setCharacterEncoding("utf-8");
			int kor = Integer.parseInt(request.getParameter("kor"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			int math = Integer.parseInt(request.getParameter("math"));
			int total = kor+eng+math;
			double avg = total/3.0;
		%>
		<table>
			<tr>
				<td>학번</td>
				<td> <%= request.getParameter("stuNo") %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td> <%= request.getParameter("name") %></td>
			</tr>
			<tr>
				<td>국어점수</td>
				<td> <%= kor %></td>
			</tr>
			<tr>
				<td>영어점수</td>
				<td> <%= eng %></td>
			</tr>
			<tr>
				<td>수학점수</td>
				<td><%= math %></td>
			</tr>
			<tr>
				<td>총점</td>
				<td><%= total %></td>
			</tr>
			<tr>
				<td>평균</td>
				<td><%= avg %></td>
			</tr>
		
		
		
		</table>
	</body>
</html>