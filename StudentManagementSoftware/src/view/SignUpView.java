package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.SignUpController;
import model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class SignUpView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField accField;
	private JTextField usernameField;
	private JLabel lblMtKhu;
	private JPasswordField passwordField;
	private JPasswordField passwordConfirmField;
	private JLabel lblTnNgiDng;

	
	private SignUpController signUpController;
	private JButton btnSignUp;
	private JButton btnLogin;
	
	
	
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
					SignUpView frame = new SignUpView();
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
	public SignUpView() {
		signUpController = new SignUpController(this);
		initComponents();
	}
	
	private void initComponents()
	{
		setTitle("Sign up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 457);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00E0i kho\u1EA3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(47, 125, 123, 22);
		contentPane.add(lblNewLabel);
		
		accField = new JTextField();
		accField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		accField.setBounds(258, 119, 216, 37);
		contentPane.add(accField);
		accField.setColumns(10);
		
		lblMtKhu = new JLabel("M\u1EADt kh\u1EA9u");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMtKhu.setBounds(47, 202, 123, 22);
		contentPane.add(lblMtKhu);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(258, 196, 216, 37);
		contentPane.add(passwordField);
		
		JLabel lblNhpLiMt = new JLabel("Nh\u1EADp l\u1EA1i m\u1EADt kh\u1EA9u");
		lblNhpLiMt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNhpLiMt.setBounds(47, 269, 147, 22);
		contentPane.add(lblNhpLiMt);
		
		passwordConfirmField = new JPasswordField();
		passwordConfirmField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordConfirmField.setBounds(258, 265, 216, 37);
		contentPane.add(passwordConfirmField);
		
		btnSignUp = new JButton("\u0110\u0103ng k\u00FD");
		btnSignUp.addActionListener(signUpController);
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSignUp.setBounds(258, 344, 129, 46);
		contentPane.add(btnSignUp);
		
		lblTnNgiDng = new JLabel("T\u00EAn ng\u01B0\u1EDDi d\u00F9ng");
		lblTnNgiDng.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTnNgiDng.setBounds(47, 57, 130, 22);
		contentPane.add(lblTnNgiDng);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usernameField.setColumns(10);
		usernameField.setBounds(258, 51, 216, 37);
		contentPane.add(usernameField);
		
		btnLogin = new JButton("Đăng nhập");
		btnLogin.addActionListener(signUpController);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(424, 344, 129, 46);
		contentPane.add(btnLogin);
	}
	
	
	public User getUserInfoByForm()
	{
		String username = usernameField.getText();
		String account = accField.getText();
		String password = String.valueOf(passwordField.getPassword());
		String passwordConfirm = String.valueOf(passwordConfirmField.getPassword());
		
		if(!validateUsername(username) || !validateAccount(account) || !validatePassword(password) || !validateConfirmPassword(password, passwordConfirm))
			return null;
		
		User user = new User(account, password, username);
		
		return user;
	}
	
	public void showMessage(String mess, String type)
	{
		if(type.equals("Error"))
			JOptionPane.showMessageDialog(this, mess, "Thông báo lỗi!", JOptionPane.ERROR_MESSAGE);
		else if(type.equals("Warning"))
			JOptionPane.showMessageDialog(this, mess, "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
		else if(type.equals("Success"))
		{
			JOptionPane.showMessageDialog(this, mess, "Thành công!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private boolean validateUsername(String username)
	{
		if(username.trim().equals(""))
		{
			showMessage("Vui lòng nhập tên người dùng", "Warning");
			return false;
		}
		return true;
	}
	
	
	private boolean validateAccount(String acc)
	{
		if(acc.trim().equals(""))
		{
			showMessage("Vui lòng nhập tài khoản", "Warning");
			return false;
		}
		return true;
	}
	
	private boolean validatePassword(String password)
	{
		if(password.trim().equals(""))
		{
			showMessage("Vui lòng nhập một mật khẩu", "Warning");
			return false;
		}
		return true;
	}
	
	private boolean validateConfirmPassword(String password, String confirmPassword)
	{
		if(!password.equals(confirmPassword))
		{
			showMessage("Mật khẩu nhập lại không chính xác!", "Error");
			return false;
		}
		return true;
	}


	public void deleteForm() {
		// TODO Auto-generated method stub
		usernameField.setText("");
		accField.setText("");
		passwordField.setText("");
		passwordConfirmField.setText("");
	}
}
