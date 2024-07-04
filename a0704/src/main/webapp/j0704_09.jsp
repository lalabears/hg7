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
	<!--     bean를 사용해서 전달받은 값들을
	 출력해보세요 j0704_05 참고 -->
	<% request.setCharacterEncoding("utf-8"); // post방식에서 한글안깨지기 %>
	<jsp:useBean id="stu1" class="com.java.www.Student" />
	<jsp:setProperty property="*" name="stu1"/>
	
		<table>
			<tr>
				<td>학번</td>
				<td><%= stu1.getStuNo() %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= stu1.getName() %> </td>
			</tr>
			<tr>
				<td>국어점수</td>
				<td><%= stu1.getKor() %></td>
			</tr>
			<tr>
				<td>영어점수</td>
				<td><%= stu1.getEng() %> </td>
			</tr>
			<tr>
				<td>수학점수</td>
				<td><%= stu1.getMath() %></td>
			</tr>
			<tr>
			<%  stu1.setTotal( stu1.getKor()+stu1.getEng()+stu1.getMath()  );   %>
				<td>총점</td>
				<td><%= stu1.getTotal() %></td>
			</tr>
			<tr>
			<% stu1.setAvg( stu1.getTotal()/3.0  ); %>
				<td>평균</td>
				<td><%= stu1.getAvg() %></td>
			</tr>
		</table>
	</body>
</html>