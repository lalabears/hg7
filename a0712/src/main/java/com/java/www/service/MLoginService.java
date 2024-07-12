package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.www.dao.MemberDao;
import com.java.www.dto.Member;

public class MLoginService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MemberDao mdao = new MemberDao();
		Member member = mdao.selectLogin(id,pw);
		System.out.println("MLoginService");
		System.out.println(member.getId()+member.getPw());
		
		HttpSession session = request.getSession();
		if(member!=null) {
			session.setAttribute("sessionId", member.getId());
			session.setAttribute("sessionName", member.getName());
		}
		request.setAttribute("member", member);

	}

}
