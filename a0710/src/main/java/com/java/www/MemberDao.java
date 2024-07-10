package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Member m;
	String id,pw,name,phone,hobbys,gender;
	Timestamp jdate;
	String query;
	
	
	public int insertOne(Member mem) {
		int result = 0; 
		try {
			conn = getConnection();
			query = "insert into member"
					+ "(id,pw,name,phone,gender,hobbys,jdate) "
					+ "values(?,?,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPw());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getPhone());
			pstmt.setString(5, mem.getGender());
			pstmt.setString(6, mem.getHobbys());
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2 ) {e2.printStackTrace();}
		}
		
		return result; 
	}
	
	
	
	public ArrayList<Member> selectAll(){
		ArrayList<Member> list = new ArrayList<>();
		try {
			conn = getConnection();
			query ="select * from member";
			pstmt= conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobbys = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
				m = new Member(id, pw, name, phone, gender, hobbys, jdate); 
				list.add(m);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2 ) {e2.printStackTrace();}
		}
		
		
		return list; 
		
	}
	
	
	
	private Connection getConnection() {
		Connection connection = null ;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
			connection = ds.getConnection();
		}catch(Exception e) {e.printStackTrace();}
		return connection;
	}
	
	public Member selectLogin(String uId,String uPw) {
		try {
			conn = getConnection();
			query ="select * from member where id=? and pw=?";
			pstmt= conn.prepareStatement(query);
			pstmt.setString(1, uId);
			pstmt.setString(2, uPw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				// db컬럼 확인하기 
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				gender = rs.getString("gender");
				hobbys = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
				// 생성자 순서 확인하기
				m = new Member(id, pw, name, phone, gender, hobbys, jdate); 
			}
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2 ) {e2.printStackTrace();}
		}
		return m;
	}
}


