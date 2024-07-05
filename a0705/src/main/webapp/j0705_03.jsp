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
	String id, name, pw, phone; 
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>db 연결</title>
		<style>
		table, th, td {border: 1px solid black; border-collapse: collapse;
						text-align: center; }
		th, td{width : 200px; height: 40px;}
		</style>
	</head>
	<body>
	
		<table>
			<tr>
				<th> 아이디 </th>
				<th> 이름 </th>
				<th> 비밀번호 </th>
				<th> 전화번호 </th>
			</tr>
		<%
			try{
				context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
				conn = dataSource.getConnection();
				//String query ="select * from member where id=? and pw=?";
				String query ="select * from member";
				pstmt = conn.prepareStatement(query);
				String uid = "aaa";
				String upw = "111";
			//	pstmt.setString(1, uid);
			//	pstmt.setString(2, upw);
				rs = pstmt.executeQuery();
				while(rs.next()){  // rs데이터가 있으면 
					name = rs.getString("name");
					id   = rs.getString("id");
					pw   = rs.getString("pw");
					phone = rs.getString("phone");
		%>		
			<tr>
				<td><%= id %>  </td>	
				<td><%= name %>  </td>	
				<td><%= pw %> </td>	
				<td><%= phone %>  </td>	
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