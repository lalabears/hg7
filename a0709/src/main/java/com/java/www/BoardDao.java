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
	Context context;
	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query; 
	Board board; 
	private int bno, bgroup, bstep, bindent, bhit;
	String btitle, bcontent, id, bfile;
	Timestamp bdate;
	ArrayList<Board> list = new ArrayList<>();
	
	public ArrayList<Board> selectAll(){
		try {
			conn = getConnection();
			query = "select * from board";
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
	
	
	private Connection getConnection() {
		Connection connection=null;
		try {
			context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle8");
			connection = ds.getConnection();
		} catch( Exception e ) {e.printStackTrace();}
		return connection;
	}
	
}// BoardDao
