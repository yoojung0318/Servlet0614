package com.yoojung0318.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//url mapping
@WebServlet("/servlet/test05")
public class ServletTest05Controller extends HttpServlet {

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//전달 인수 설정
		String danString = request.getParameter("dan");
		
		//문자열 -> 숫자로 변환 ( string -> 숫자)
		int dan =  Integer.parseInt(danString);
		
		out.println("<html> <head><title>구구단</title></head>  <body>");
		out.println("<ul>");
		
		for(int i = 1; i <= 9; i++) {
			out.println("<li>" +dan + "x" +  i + "=" + (dan*i) + "</li>");
		}
		out.println("</ul>");
		out.println("</body></html>");
		
		//html 문서 ( 자바가 필요없는 순수한 html 문서) = webapp 에서 설정
		
		}
}
