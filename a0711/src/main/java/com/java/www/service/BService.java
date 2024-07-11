package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BService {
	// 인터페이스는 미완성 메서드들로만구성되어있음
	void execute(HttpServletRequest request, HttpServletResponse response);
}
