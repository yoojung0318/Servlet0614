package com.yoojung0318.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class ServletTest09controller extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//지원자 이름, 자기소개
		
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		
		out.println("<html> <head><title><h2>자기소개</h2></title></head>");
		out.println("<body>");
		
		out.println("<h1>" + name + "님 지원이 완료되었습니다. </h1> <hr>");
		out.println("지원내용 <br>" + content);
	}

}
