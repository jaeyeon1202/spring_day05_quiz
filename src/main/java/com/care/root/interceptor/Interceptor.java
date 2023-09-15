package com.care.root.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("session")==null) {
			String msg = "<script> alert('�α��� �� �۾��Ⱑ �����մϴ�.');";
			msg += "location.href = '/root/member/login';</script>;";
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(msg);
			
			return false;
		}
		
		return true;
	}

	
 
	
}
