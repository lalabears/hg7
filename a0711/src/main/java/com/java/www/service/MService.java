package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MService {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
