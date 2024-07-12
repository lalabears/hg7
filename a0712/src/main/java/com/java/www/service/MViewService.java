package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.www.dao.MemberDao;
import com.java.www.dto.Member;

public class MViewService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// session아이디로 db에서 회원 한명의 정보를 가져오기 
		HttpSession session = request.getSession();
		
		String mid = (String)session.getAttribute("sessionId");
		MemberDao mdao = new MemberDao();
		Member member = mdao.selectOne(mid);
		
		System.out.println("mview service");
		if(member!=null) {
			System.out.println(member.getId());
			System.out.println(member.getName());
			System.out.println(member.getPhone());
		}
		
		request.setAttribute("member", member);
		

	}

}
