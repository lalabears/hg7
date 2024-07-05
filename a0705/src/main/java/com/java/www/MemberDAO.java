package com.java.www;
// control + shift - o 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO{
	//iv 
	Context context;
	DataSource dataSource;
	Connection conn;
	PreparedStatement  pstmt; 
	ResultSet rs;
	
	String id, pw, name, phone;
	String query;
	
	int result=0; 
	
	// 메서드 
	private Connection getConnection() {
		Connection connection = null; 
		try {
			context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
			connection = dataSource.getConnection();
		}catch(Exception e) {e.printStackTrace();}
		return connection;
	}
	
	public int updateMember(Member member) {
		try {
			conn = getConnection();
			query ="update member set pw=?, name=?,phone=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getId());
			// 확인용
			System.out.println(member.getName());
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(Exception e2) {e2.printStackTrace();}
		}
		
		return result;
	}
	
	
	public Member selectMemberOne(String userId) {
		System.out.println(userId);
		Member member = null; 
		try {
			conn = getConnection();
			query = "select * from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				member = new Member(name, id, pw, phone);
			}
		}catch(Exception e) { e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn!=null) conn.close();
				
			}catch(Exception e2) {e2.printStackTrace(); }
		}
		
		return member;
	}
	
	
	
	public Member selectLogin(String userId, String userPw ) {
		System.out.println(userId);
		Member member = null; 
		try {
			conn = getConnection();
			query = "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				member = new Member(name, id, pw, phone);
			}
		}catch(Exception e) { e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn!=null) conn.close();
				
			}catch(Exception e2) {e2.printStackTrace(); }
		}
		return member;
	}
	
	
	
	public ArrayList<Member> selectMember(){
		System.out.println("Called");
		ArrayList<Member> list = new ArrayList<>();
		try {
			conn = getConnection();
			query ="select * from member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery(); 
			while(rs.next()) {
				id =rs.getString("id");
				pw =rs.getString("pw");
				name =rs.getString("name");
				phone =rs.getString("phone");
				System.out.println(id);
				list.add(new Member(name, id, pw, phone));
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {e2.printStackTrace();	}
		}	
		return list;
	}
	
	
	public int insertMember(Member member) {
		try{
			context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
			conn = dataSource.getConnection();
			query = "insert into member(id,pw,name,phone) values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone());
			// 성공하면 1, 실패하면 0 
			result = pstmt.executeUpdate(); // insert, update, delete 
		}catch(Exception e){ e.printStackTrace();}
		finally{
			try{
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2){e2.printStackTrace();}
		}
		return result; 
	}
	
	

	
	
	
}
