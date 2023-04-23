package com.spring.board.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;



@Component
public class DBUtil {
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL="jdbc:mysql://127.0.0.1:3306/ssafysample?characterEncoding=UTF-8&serverTimezone=UTC";
	private static final String DB_USER="root";
	private static final String DB_PW="root";
	
	public DBUtil() {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
		return conn;
	}
	
	public void close(AutoCloseable... closeables) {
		for(AutoCloseable c: closeables) {
			if(c!=null) {
				try {
					c.close();
				} catch (Exception e) {
					System.out.println("close 에러");
					e.printStackTrace();
				}
			}
		}
		
	}
}
