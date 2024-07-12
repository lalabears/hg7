package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;

public class BDeleteService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 한개 삭제하기 
		int bno = Integer.parseInt(request.getParameter("bno"));
		BoardDao bdao = new BoardDao();
		int result = bdao.deleteOne(bno);
		
		request.setAttribute("result", result);

	}

}
