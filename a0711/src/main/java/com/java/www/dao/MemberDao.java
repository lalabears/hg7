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
	Member member;
	ArrayList<Member> list = new ArrayList<>();
	String id, pw, name, phone, hobbys,gender;
	Timestamp jdate;
	public Member selectLogin(String uid, String upw) {
		try {
			conn= getConnection();
			query="select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, uid);
			pstmt.setString(2, upw);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobbys = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
				member = new Member(id,pw,name,phone,gender,hobbys,jdate);	
			}
		}catch(Exception e ) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null)conn.close();
				if(pstmt!=null) pstmt.close();
			}catch(Exception e2) {e2.printStackTrace();}
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


	public ArrayList<Member> selectAll() {
		try {
			conn= getConnection();
			query="select * from member order by jdate";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobbys = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
				member = new Member(id,pw,name,phone,gender,hobbys,jdate);	
				list.add(member);
			}
		}catch(Exception e ) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null)conn.close();
				if(pstmt!=null) pstmt.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return list;
	}


	public int insertOne(Member m) {
		int result = 0;
		try {
			conn = getConnection();
			query ="insert into member values (?,?,?,?,?,?,sysdate)";
			//'eee','1111','유관순','010-2222-2222','Female','',sysdate
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPw());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getPhone());
			pstmt.setString(5, m.getGender());
			pstmt.setString(6, m.getHobbys());
			result = pstmt.executeUpdate();
		}catch(Exception e ) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null)conn.close();
				if(pstmt!=null) pstmt.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return result;
	}
}
