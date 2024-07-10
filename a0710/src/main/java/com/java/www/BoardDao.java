package com.java.www;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class BoardDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;
	Board b;
	int bno, bgroup, bstep, bindent, bhit;
	String btitle, bcontent, bfile, id;
	Timestamp bdate;
	ArrayList<Board> list = new ArrayList<>();
	
	
	public int insertOne(Board b) {
		int result = 0;
		try {
			conn = getConnection();
			query = "insert into board values "
					+ "(board_seq.nextval,?,?,?,sysdate,0,board_seq.currval,0,0,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getId());
			pstmt.setString(2, b.getBtitle());
			pstmt.setString(3, b.getBcontent());
			pstmt.setString(4, b.getBfile());
			result = pstmt.executeUpdate();
		}catch(Exception e) { e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return result;
	}
	
	
	public Board selectOne(int bno) {
		try {
			conn = getConnection();
			query = "select * from board where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				this.bno = rs.getInt("bno");
				bstep = rs.getInt("bstep");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bhit = rs.getInt("bhit");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bfile = rs.getString("bfile");
				bdate = rs.getTimestamp("bdate");
				b = new Board(this.bno,id,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent,bfile);

			}
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return b; 
	}
	
	public ArrayList<Board> selectAll(){
		try {
			conn = getConnection();
			query ="select * from board";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				bstep = rs.getInt("bstep");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bhit = rs.getInt("bhit");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bfile = rs.getString("bfile");
				bdate = rs.getTimestamp("bdate");
				b = new Board(bno,id,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent,bfile);
				list.add(b);
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
