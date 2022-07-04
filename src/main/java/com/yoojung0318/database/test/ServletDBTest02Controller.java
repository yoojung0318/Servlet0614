package com.yoojung0318.database.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yoojung0318.common.MysqlService;

public class ServletDBTest02Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		

		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String insertQuery = "INSERT INTO `favorite`(`name`, `url`, `createdAt`, `updatedAt`)\r\n"
				+ "VALUES\r\n"
				+ "('마론달', 	'http://marondal.com', now(), now()),\r\n"
				+ "('구글',	    'https://google.com',now(), now()),\r\n"
				+ "('네이버',	'https://naver.com', now(), now()),\r\n"
				+ "('다음',	    'https://daum.net',now(), now());";
				
				
	}			
}
