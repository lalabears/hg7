package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BDeleteService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 주소에 있는 값이 넘어온다. 
		int bno = Integer.parseInt(request.getParameter("bno").trim());
		BoardDao bdao = new BoardDao();
		int result = bdao.deleteOne(bno);
		
		request.setAttribute("result", result);

	}

}
