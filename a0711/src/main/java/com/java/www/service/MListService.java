package com.java.www.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.MemberDao;
import com.java.www.dto.Member;

public class MListService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao mdao = new MemberDao();
		ArrayList<Member> list = mdao.selectAll();
		request.setAttribute("list", list);

	}

}
