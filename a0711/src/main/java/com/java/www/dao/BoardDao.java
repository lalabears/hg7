package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Board;

public class BoardDao {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;
	
	Board board;
	ArrayList<Board> list = new ArrayList<>();
	
	int bno, bgroup, bstep, bindent, bhit; 
	String id, btitle, bcontent, bfile;
	Timestamp bdate;
	
	private Connection getConnection() {
		Connection connection = null ;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
			connection = ds.getConnection();
		}catch(Exception e) {e.printStackTrace();}
		return connection;
	}

	public ArrayList<Board> selectAll() {
		try {
			conn = getConnection();
			query ="select * from board"; 
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				id = rs.getString("id");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bhit = rs.getInt("bhit");
				bdate = rs.getTimestamp("bdate");
				bfile = rs.getString("bfile");
				board = new Board(bno,id,btitle,bcontent, bdate, bhit,bgroup,bstep,bindent, bfile);
				list.add(board);
			}
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		
		
		return list;
	}

	public Board selectOne(int bno2) {
		try {
			conn = getConnection();
			query ="select * from board where bno = ?"; 
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				id = rs.getString("id");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bhit = rs.getInt("bhit");
				bdate = rs.getTimestamp("bdate");
				bfile = rs.getString("bfile");
				board = new Board(bno,id,btitle,bcontent, bdate, bhit,bgroup,bstep,bindent, bfile);
			}
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		
		return board;
	}

	public int insertOne(Board b) {
		int result = 0; 
		try {
			conn = getConnection();
			query = "insert into board values(board_seq.nextval, ?,?,?,sysdate,0,board_seq.currval, 0,0,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getId());
			pstmt.setString(2, b.getBtitle());
			pstmt.setString(3, b.getBcontent());
			pstmt.setString(4, b.getBfile());
			result = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch (Exception e2) {e2.printStackTrace();}
		}
		return result;
	}

	public int deleteOne(int bno2) {
		int result = 0;
		
		try {
			conn = getConnection();
			query = "DELETE FROM board WHERE bno = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno2);
			result = pstmt.executeUpdate();
		}catch(Exception e ) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch (Exception e2) {e2.printStackTrace();}
		}
		
		return result;
	}

	public int updateOne(Board b) {
		int result = 0 ; 
		try {
			conn = getConnection();
			query = "update board set btitle=?, "
					+ "bcontent=?, bfile=?, bdate=sysdate where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getBtitle());
			pstmt.setString(2, b.getBcontent());
			pstmt.setString(3, b.getBfile());
			pstmt.setInt(4, b.getBno());
			result = pstmt.executeUpdate();
			
		}catch(Exception e ) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch (Exception e2) {e2.printStackTrace();}
		}
		return result;
	}
	
	

}
