package com.yoojung0318.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/ex05")
public class ServletEx05Controller extends HttpServlet{
 /*post -> 너무 길어서 주소에 포함시키기 어려운 경우 등.. */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		//이름, 생년월일 전달 받고, 이름 나이 출력
		//name, birthday
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		//19990423
		String yearString = birthday.substring(0,4);
		int year = Integer.parseInt(yearString);
		
		int age = 2022 - year + 1;
		
		out.println("<html><head><title>post method </title></head> <body>");
		out.println("이름 : " + name + "<br>");
		out.println("나이 : " + age);
		out.println("</body></html>");
	}

}
