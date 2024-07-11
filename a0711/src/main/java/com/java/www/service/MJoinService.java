package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.MemberDao;
import com.java.www.dto.Member;

public class MJoinService implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		String uname = request.getParameter("uname");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String hobbys="";
		for(int i = 0 ; i < hobby.length ; i++ ) {
			if(i==0) hobbys+=hobby[i];
			else hobbys+=","+hobby[i];
		}
		MemberDao mdao = new MemberDao();
		Member member = new Member(uid, upw, uname, phone, gender, hobbys);
		int result = mdao.insertOne(member);
		
		request.setAttribute("result", result);
		
		
		
	}

}
