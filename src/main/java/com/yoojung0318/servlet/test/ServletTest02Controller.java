package com.yoojung0318.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*시간 출력
현재의 시간을 아래와 같은 형태로 출력하세요.
web.xml URL Mapping 후 servlet을 이용해서 출력하세요.
Content Type은 text/plain으로 설정하세요.
24시간 표현법으로 출력하세요.*/
public class ServletTest02Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//문자열 전달
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		//현재날짜
		Date now = new Date ();
		//출력
		PrintWriter out = response.getWriter();
		
		//원하는 형태로 날짜 출력
		SimpleDateFormat fomatter = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
		String hourString = fomatter.format(now);
		out.println(hourString);
				
	}
}
