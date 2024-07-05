<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%! // 전역변수 선언은 선언식을 사용함. 
	// control + shift + m   
	Connection conn = null; // sqlDeveloper를 여는것과 같다
//	Statement stmt = null;  // sqlDeveloper에소 접속을 실행시키는 것과같다
	PreparedStatement pstmt = null; 
	ResultSet rs = null;    // 데이터를 가져옴 
	String id,  name, pw, phone;  	
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DB연결하기</title>
	</head>
	<body>
		<%
			try{
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String dbId = "scott";
				String dbPw = "tiger";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,dbId,dbPw);
			//	stmt = conn.createStatement();
				// id = aaa pw = 111 
				String uid = "aaa";
				String upw = "111";
		//		String query = "select * from member where id='"+uid+"' and pw='"+upw+"'";
		//		rs = stmt.executeQuery(query); 
				String query ="select * from member where id=? and pw=?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, uid);
				pstmt.setString(2, upw);
				rs = pstmt.executeQuery();
				while(rs.next()){  // rs데이터가 있으면 
					name = rs.getString("name");
					id   = rs.getString("id");
					pw   = rs.getString("pw");
					phone = rs.getString("phone");
			%>
				<table>
					<tr>
						<td><%= name %></td>
						<td><%= id %></td>
						<td><%= pw %></td>
						<td><%= phone %></td>
					</tr>
				</table>	
			<% 
				} // rs모든데이터를 다 가져옴
			}catch(Exception e) { e.printStackTrace();}
			finally{
				try{
					if(rs!=null) rs.close();
//					if(stmt!=null) stmt.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				}catch(Exception e) { e.printStackTrace();}
			}
			
		
		%>
		
	
	</body>
</html>