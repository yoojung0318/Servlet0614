package com.yoojung0318.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test06")
public class ServletTest06Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String number1String = request.getParameter("number1");
		String number2String = request.getParameter("number2");
		
		//문자열 -> 숫자
		int number1 = Integer.parseInt(number1String);
		int number2 = Integer.parseInt(number2String);
		
		int add = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int div = number1 / number2;
		
		// json 표현 형태
		//{"add":1524, "sub"":141, "mul":21511, "div":15}
		out.println("{\"add\":" + add + ", +  \"sub\" :" + sub + ", \"mul\":" + mul + ", \"div\":" + div + " }");
		
		out.println("<html> <head><title>사칙연산</title></head>  <body>");
		out.println("<ul>");
		
		
	}
}
