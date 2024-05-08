package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.LoginController;
import model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField accField;
	private JPasswordField passwordField;
	private JButton btnSignUp;
	private JButton btnLogin;
	
	private LoginController loginController;

	public JButton getBtnSignUp() {
		return btnSignUp;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		loginController = new LoginController(this);
		initComponents();
	}
	
	private void initComponents()
	{
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 445);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(47, 144, 78, 22);
		contentPane.add(lblNewLabel);
		
		accField = new JTextField();
		accField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		accField.setColumns(10);
		accField.setBounds(258, 138, 323, 37);
		contentPane.add(accField);
		
		JLabel lblMtKhu = new JLabel("M\u1EADt kh\u1EA9u");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMtKhu.setBounds(47, 213, 123, 37);
		contentPane.add(lblMtKhu);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(258, 213, 323, 37);
		contentPane.add(passwordField);
		
		btnLogin = new JButton("\u0110\u0103ng nh\u1EADp");
		btnLogin.addActionListener(loginController);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(258, 298, 142, 46);
		contentPane.add(btnLogin);
		
		btnSignUp = new JButton("Đăng ký");
		btnSignUp.addActionListener(loginController);
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSignUp.setBounds(439, 298, 142, 46);
		contentPane.add(btnSignUp);
		
		JLabel lblNewLabel_1 = new JLabel("Chào mừng bạn đến với phần mềm quản lí sinh viên");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(67, 33, 524, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vui lòng đăng nhập để sử dụng dịch vụ");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(115, 80, 392, 27);
		contentPane.add(lblNewLabel_1_1);
		
		setVisible(true);
	}

	
	public User getUserInfoFromForm()
	{
		String acc = accField.getText();
		String password = String.valueOf(passwordField.getPassword());
		
		if(!validateAccount(acc) || !validatePassword(password))
			return null;
		User user = new User(acc, password);
		return user;
	}
	
	public void showMessage(String mess, String type)
	{
		if(type.equals("Error"))
			JOptionPane.showMessageDialog(this, mess, "Có lỗi!", JOptionPane.ERROR_MESSAGE);
		else if(type.equals("Warning"))
			JOptionPane.showMessageDialog(this, mess, "Cảnh báo", JOptionPane.WARNING_MESSAGE);
		else if(type.equals("Success"))
			JOptionPane.showMessageDialog(this, mess, "Thành công", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private boolean validateAccount(String acc)
	{
		acc = acc.trim();
		if(acc.equals(""))
		{
			showMessage("Vui lòng nhập dữ liệu cho tài khoản", "Warning");			
			return false;
		}
		return true;
	}
	
	private boolean validatePassword(String password)
	{
		password = password.trim();
		if(password.equals(""))
		{
			showMessage("Vui lòng nhập dữ liệu cho mật khẩu", "Warning");
			return false;
		}
		return true;
	}
}
