package model;

public class User {
	private String account;
	private String password;
	private String username;
	
	public User() {
		super();
	}
	
	public User(String account, String password) {
		super();
		this.account = account;
		this.password = password;
	}

	public User(String account, String password, String username) {
		super();
		this.account = account;
		this.password = password;
		this.username = username;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [account=" + account + ", password=" + password + ", username=" + username + "]";
	}
	
	
}
