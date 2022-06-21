package com.yoojung0318.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*오늘 날짜 출력
오늘 날짜를 아래와 같이 출력하세요.
web.xml URL Mapping 후 servlet을 이용해서 출력하세요.
Content Type은 text/plain으로 설정하세요.*/

public class ServletTest01Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//문자열 전달 -  text/css MIME
		response.setContentType("text/plain");
		//캐릭터셋, 인코딩
		response.setCharacterEncoding("utf-8");
		
		//현재날짜
		Date now = new Date();
		//출력 기능
		PrintWriter out = response.getWriter();
		//원하는 형태로 날짜 출력
		SimpleDateFormat fomatter = new SimpleDateFormat("오늘의 날짜는 yyyy년 MM월 dd일");
		String dateString = fomatter.format(now);
		out.println(dateString);
	}
}
