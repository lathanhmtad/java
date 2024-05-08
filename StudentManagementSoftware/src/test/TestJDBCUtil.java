package test;

import java.sql.Connection;

import database.JDBCUtil;

public class TestJDBCUtil {
	public static void main(String[] args) {
		Connection c = JDBCUtil.getConnection();
		
//		JDBCUtil.printConnectionInfo(c);
		JDBCUtil.printConnectionInfo(c);
		System.out.println(c);
	}
}
