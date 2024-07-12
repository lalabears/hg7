package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BWriteService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uploadPath = "c:/upload";
		int size = 10*1024*1024;
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath
					, size, "utf-8", new DefaultFileRenamePolicy());
			String id = multi.getParameter("id");
			String btitle = multi.getParameter("btitle");
			String bcontent = multi.getParameter("bcontent");
			String bfile = multi.getFilesystemName("bfile");
			BoardDao bdao = new BoardDao();
			Board board = new Board();
			board.setId(id);
			board.setBtitle(btitle);
			board.setBcontent(bcontent);
			board.setBfile(bfile);
			int result = bdao.insertOne(board);
			request.setAttribute("result", result);
			
			
			
		}catch(Exception e) {e.printStackTrace();}
		

	}

}
