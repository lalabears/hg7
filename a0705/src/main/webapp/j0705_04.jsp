<%@page import="javax.naming.*"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Context context = null; 
	DataSource dataSource = null; 
	Connection conn = null; 
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 
	String query; 
	String name;
	int stuno, kor, eng, math, total;
	double avg;
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적프로그램</title>
		<style>
		table, th, td {border: 1px solid black; border-collapse: collapse;
						text-align: center; }
		th, td{width : 200px; height: 40px;}
		</style>
	</head>
	<body>
		<table>
			<tr>
				<th>학번</th><th>이름</th><th>국어</th><th>영어</th>
				<th>수학</th><th>총점</th><th>평균</th>
			</tr>
		<%
			try{
				context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
				conn = dataSource.getConnection();
				query = "select * from student where math between ? and ?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, "80");
				pstmt.setString(2, "90");
				rs = pstmt.executeQuery();
				while(rs.next()){
					stuno = rs.getInt("stuno");
					name = rs.getString("name");
					kor = rs.getInt("kor");
					eng = rs.getInt("eng");
					math = rs.getInt("math");
					total = rs.getInt("total");
					avg = rs.getDouble("avg");
		%>		
				<tr>
					<td> <%= stuno %></td>
					<td><%= name %></td>
					<td><%= kor %></td>
					<td><%= eng %></td>
					<td><%= math %></td>
					<td><%= total %></td>
					<td><%= avg %></td>
			    </tr>
				
		<%		
				} // while
			}catch(Exception e){ e.printStackTrace();}
			finally{
				try{
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn !=null) conn.close();
				}catch(Exception e){e.printStackTrace();}
			}

		
		
		
		%>
		</table>
	
	
	
	
	
	
	</body>
</html>