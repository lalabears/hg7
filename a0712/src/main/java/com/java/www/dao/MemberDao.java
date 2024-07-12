package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Member;

public class MemberDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;
	// 변수선언 
	Member member;
	ArrayList<Member> list = new ArrayList<>();
	String name, id, pw, email, addr, phone, gender;
	Timestamp bdate;
	
	public Member selectLogin(String mid, String mpw) {
		try {
			conn = getConnection();
			query ="select * from mem where id=? and pw =?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mid);
			pstmt.setString(2, mpw);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				name=rs.getString("name");
				id=rs.getString("id");
				pw=rs.getString("pw");
				member = new Member();
				member.setId(id);
				member.setPw(pw);
				member.setName(name);				
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception e2) {e2.printStackTrace();}
		}
		return member;
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




	public int insertOne(Member m) {
		int result = 0;
		try {
			conn = getConnection();
			query = "insert into mem(mno,name,id,pw,email,addr,phone,bdate,gender) values(mem_seq.nextval, ?,?,?,?,?,?,?,?)";
			// insert into mem(mno,name,id,pw,email,addr,phone,bdate,gender) 
			// values(mem_seq.nextval, ?,?,?,?,?,?,?,?)		
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getEmail());
			pstmt.setString(5, m.getAddr());
			pstmt.setString(6, m.getPhone());
			pstmt.setTimestamp(7, m.getBdate());
			pstmt.setString(8, m.getGender());
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception e2) {e2.printStackTrace();}
		}
		return result;
	}




	public Member selectOne(String mid) {
		try {
			conn = getConnection();
			query ="select * from mem where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				name=rs.getString("name");
				id=rs.getString("id");
				pw=rs.getString("pw");
				email=rs.getString("email");
				addr=rs.getString("addr");
				phone=rs.getString("phone");
				bdate=rs.getTimestamp("bdate");
				gender = rs.getString("gender");
				member = new Member(name,id,pw,email,addr,phone,gender,bdate);
			}
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception e2) {e2.printStackTrace();}
		}
		
		return member;
	}
	
	
	

}
