package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class UserDAO implements DAOInterface<User> {

	public static UserDAO getInstance()
	{
		return new UserDAO();
	}
	
	@Override
	public int insert(User t) {
		int res = 0;
		try
		{
			
			Connection conn = JDBCUtil.getConnection();
			
			String sql = "INSERT INTO Users VALUES(?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getAccount());
			ps.setString(2, t.getPassword());
			ps.setString(3, t.getUsername());
			
			res = ps.executeUpdate();
			
			JDBCUtil.closeConnection(conn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int update(User t) {
		return 0;
	}

	@Override
	public int delete(User t) {
		return 0;
	}

	@Override
	public ArrayList<User> selectAll() {
		return null;
	}

	@Override
	public User selectById(User t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public User getUserByAccount(User t)
	{
		User user = null;
		
		try
		{
			// Tạo kết nối với database
			Connection conn = JDBCUtil.getConnection();
			
			
			String sql = "SELECT * FROM Users WHERE Account = ? AND MK = ?";
				
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getAccount());
			ps.setString(2, t.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next())
			{
				String account = rs.getString("Account");
				String password = rs.getString("MK");
				String username = rs.getString("Username");
				user = new User(account, password, username);
			}
			
			JDBCUtil.closeConnection(conn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	public User getUserByAccount(String acc)
	{
		User user = null;
		
		try
		{
			// Tạo kết nối với database
			Connection conn = JDBCUtil.getConnection();
			
			
			String sql = "SELECT * FROM Users WHERE Account = ?";
				
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, acc);
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next())
			{
				String account = rs.getString("Account");
				String password = rs.getString("MK");
				String username = rs.getString("Username");
				user = new User(account, password, username);
			}
			
			JDBCUtil.closeConnection(conn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return user;
	}
}
