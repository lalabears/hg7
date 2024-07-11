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
}
