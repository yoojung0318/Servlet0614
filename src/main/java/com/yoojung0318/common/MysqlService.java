package com.yoojung0318.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Mysql 접속 과정을 간결하게 해준다
public class MysqlService {

	// static을 통해, 객체가 생성되어있지 않아도 사용할 수 있게 함
	private  static MysqlService mysqlService = null;
	// 접속정보, 주소, 아이디, 비번
	// final -> 수정 금지
	
	private  final String url = "jdbc:mysql://localhost:3306/yj";
	private  final String userId = "root";
	private  final String password = "root";
	
	//자주 쓰니까, 멤버변수로 만듬
	Connection connection;
	Statement statement;
	
	// 객체를 전달하는 기능
	// 객체 생성 없이 호출 가능한 메소드
	public static MysqlService getInstance() {
		if(mysqlService == null) {
			mysqlService = new MysqlService();			
		}
		
		return mysqlService;
	}
	
	//접속기능
		public void connect() {
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				
				this.connection = DriverManager.getConnection(url, userId, password);
				this.statement = connection.createStatement();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		// 쿼리 수행 기능
	// insert update delete
		public int update(String query) {
			try {
				int count = this.statement.executeUpdate(query);
				return count;
			} catch (SQLException e) {
				
				e.printStackTrace();
				return 0;
			}
		}
		// select 쿼리 수행 기능
		//resulrset -> 데이터 return 형태 
		// select 쿼리 수행 기능
		public ResultSet select(String query) {
			ResultSet resultSet;
			try {
				resultSet = this.statement.executeQuery(query);
				return resultSet;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				return null;
			}
			
		}
	}

