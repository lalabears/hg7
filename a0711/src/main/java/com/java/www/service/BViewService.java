package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BViewService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardDao bdao = new BoardDao();
		Board board = bdao.selectOne(bno);
		
		request.setAttribute("board", board);
		

	}

}
