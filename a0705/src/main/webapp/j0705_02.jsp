<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	Connection conn =null;
	Statement stmt = null;
	ResultSet rs = null; 
	String name, email, gender, jdate;
	int id, age;  
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Mem테이블연결</title>
	</head>
	<body>
	<%  //  String name, email, gender, jdate; int id, age;  
			try{
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String dbId = "scott";
				String dbPw = "tiger";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,dbId,dbPw);
				stmt = conn.createStatement();
				String query = "select * from mem";
				rs = stmt.executeQuery(query); 
				while(rs.next()){ // rs에 데이터가 있으면 참 
					name   = rs.getString("name");	
					email  = rs.getString("email");
					gender = rs.getString("gender");
					jdate  = rs.getString("jdate");
					id     = rs.getInt("id");
					age    = rs.getInt("age");
		%>
			 <table>
			 	<tr>
			 		<td> <%= id %></td>
			 		<td> <%= name %></td>
			 		<td> <%= age %></td>
			 		<td> <%= gender %></td>
			 		<td> <%= email %></td>
			 		<td> <%= jdate %></td>
			 	</tr>
			 </table>
		<%
				}
				
			}catch(Exception e) { e.printStackTrace();}
			finally{
				try{
				}catch(Exception e) { e.printStackTrace();}
			}
			
		
		%>
	
	</body>
</html>