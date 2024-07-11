package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BEditService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uploadPath = "c:/upload";
		int size = 10*1024*1024; 
		try {
			MultipartRequest multi = new MultipartRequest(
					request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
			
			String id = multi.getParameter("id").trim();
			String btitle = multi.getParameter("btitle").trim();
			String bcontent = multi.getParameter("bcontent").trim();
			String bfile = multi.getFilesystemName("bfile");
			//-----------------------------------------------------// 
			int bno = Integer.parseInt(multi.getParameter("bno").trim());
			String oldfile = multi.getParameter("oldfile").trim();
			
			System.out.println("file: "+ bfile);
			System.out.println("oldfile: "+ oldfile);
			
			BoardDao bdao = new BoardDao();
			Board b = new Board();
			if(bfile == null )	b.setBfile(oldfile);
			else b.setBfile(bfile);
			b.setBno(bno);
			b.setBtitle(btitle);
			b.setBcontent(bcontent);
			b.setId(id);
			
			int result = bdao.updateOne(b); 
			request.setAttribute("result", result);
			
			
		}catch(Exception e) {e.printStackTrace();}
	}

}
