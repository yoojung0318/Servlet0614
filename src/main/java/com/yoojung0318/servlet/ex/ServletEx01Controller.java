package com.yoojung0318.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//내가 만든 페이지가 어떤 형식의 페이지인지 선언
		//문자열 전달 -  text/css MIME
		response.setContentType("text/plain");
		//캐릭터셋, 인코딩
		response.setCharacterEncoding("utf-8");
		
		
		//현재 날짜와 시간을 보여주는 페이지
		// data -> 날짜 시간 관리, java.util로 import 해야함
		// getWriter -> throw로 import
		Date now = new Date();
		
		PrintWriter out = response.getWriter();
		out.println(now);
		
		
		//날짜를, 내가 원하는 형태로 출력
		SimpleDateFormat fomatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
		String dateString = fomatter.format(now);
		out.println(dateString);
	}
}
