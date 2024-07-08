package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
// control + shift + o
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	Connection conn; 
	PreparedStatement pstmt;
	ResultSet rs;
	MemberDto mdto;
	String query, id, pw, name, phone, gender, hobby; 
	Timestamp jdate;
	// 커넥션풀에서 connection가져오는 메서드 
	private Connection getConnection() {
		Connection connection = null; 
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
			connection = ds.getConnection();
		}catch(Exception e) {e.printStackTrace();}
		return connection;
	}// getConnection
	
	// 데이터베이스에 일치하는 아이디와 패스워드가 있는지 확인하는 메서드
	public MemberDto loginCheck(String id, String pw) {
		//                             aaa       1111
		try {
			conn = getConnection();
			query = "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				this.id = rs.getString("id");
				this.pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobbys");
				mdto = new MemberDto(this.id, this.pw, name, phone, gender, hobby);
			}
		} catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
				
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return mdto;
	}// loginCheck

	// member테이블에 멤버객체정보를 insert 하는 메서드 
	public int insertMember(MemberDto mdto2) {
		int result = 0; 
		// 쿼리의 결과가 참이면1 거짓이면 0이 리턴됨 
		try {
			conn = getConnection();
			query ="insert into member values(?,?,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mdto2.getId());
			pstmt.setString(2, mdto2.getPw());
			pstmt.setString(3, mdto2.getName());
			pstmt.setString(4, mdto2.getPhone());
			pstmt.setString(5, mdto2.getGender());
			pstmt.setString(6, mdto2.getHobby());
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return result;
	}
	
	public ArrayList<MemberDto> memberAll(){
		ArrayList<MemberDto> list = new ArrayList<>();
		try {
			conn = getConnection(); 
			query ="select * from member";
			pstmt = conn.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
				list.add(new MemberDto(id,pw,name,phone,gender,hobby,jdate));
			}
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		
		return list; 
	}
	
	
	public MemberDto memberOne(String id) {
		MemberDto m = null;
		try {
			conn = getConnection();
			query ="select * from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
				m = new MemberDto(id,pw,name,phone,gender,hobby,jdate);
			}
			
		}catch(Exception e) { e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		
		return m; 
	}

	public int memberUpdate(String id2, String phone2, String gender2, String hobby2) {
		// 매개변수가 넘어오는거 확인용 출력 
		// System.out.println(id2+phone2+gender2+hobby2);
		int result = 0;
		try {
			conn = getConnection(); //db연결
			query = "update member set phone=?, gender=?, hobbys=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, phone2);
			pstmt.setString(2, gender2);
			pstmt.setString(3, hobby2);
			pstmt.setString(4, id2);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return result;
	}

}
