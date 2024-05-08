package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class JDBCUtil {
	public static Connection getConnection()
	{
		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new SQLServerDriver());
			String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;DatabaseName=UserManagement;encrypt=true;trustServerCertificate=true";
			String username = "NDD";
			String password = "123";
			
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			System.out.println("Có lỗi kết nối xảy ra!");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	public static void closeConnection(Connection c) {
		try
		{
			if(c != null)
				c.close();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void printConnectionInfo(Connection c)
	{
		if(c != null)
		{
			try
			{
				DatabaseMetaData dbmd = c.getMetaData();
				System.out.println(dbmd.getDatabaseProductName());
				System.out.println(dbmd.getDatabaseProductVersion());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
}
