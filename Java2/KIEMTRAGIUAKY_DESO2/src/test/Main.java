package test;

import java.sql.Connection;

import data.SQLServerConnection;

public class Main {
	public static void main(String[] args) {
		Connection conn = SQLServerConnection.getConnection();
		
		System.out.println(conn);
		
		SQLServerConnection.printInfo(conn);
	}
}
