package com.yoojung0318.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class ServletTest10Controller extends HttpServlet {

	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//id와 password를 전달받고
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		//map에 있는 id password와 파라미터로 전달 받은 id password를 비교해서
		//안내문구출력
		out.println("<html> <head><title><h2>자기소개</h2></title></head>");
		out.println("<body>");
		//id가 일치하지 않을 때
		if(!id.equals(userMap.get("id"))) {
			out.println("<h1>아이디가 일치하지 않습니다.</h1> ");
		}else  if(password.equals(userMap.get("password"))){	//password가 일치하지 않을때
			out.println("<h1>비밀번호가 일치하지 않습니다 </h1>");
		} else {//로그인성공
			out.println("<h1>" + userMap.get("name") + "님 환영합니다.</h1>");
		}
		out.println("</body></html>");
		
	}

}
