package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.UserDAO;
import model.User;
//import model.User;
import view.LoginView;
import view.SignUpView;
import view.StudentListView;

public class LoginController implements ActionListener {
	
	private LoginView loginView;
	private UserDAO userDAO;
	
	
	public LoginController(LoginView loginView) {
		super();
		this.loginView = loginView;
		userDAO = new UserDAO();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		
		// Xử lí sự kiện nhất vào nút đăng nhập
		if(command.equals(loginView.getBtnLogin().getText()))
		{
			// Lấy ra account và mật khẩu được nhập từ form
			User userFromForm = loginView.getUserInfoFromForm();
			if(userFromForm == null)
				return;
			
			// Kiểm tra tài khoản và mật khẩu có tồn tại trong database không
			User userFromDB = userDAO.getUserByAccount(userFromForm);
			
			if(userFromDB == null)
				JOptionPane.showMessageDialog(loginView, "Tài khoản và mật khẩu chưa tồn tại hoặc nhập sai", "Có lỗi!", JOptionPane.ERROR_MESSAGE);
			else 
			{
				// Nếu đăng nhập thành công mở màn hình quản lý sinh viên
				loginView.showMessage("Đăng nhập thành công!", "Success");
				StudentListView studentListView = new StudentListView();
				studentListView.showManagement(userFromDB);
				loginView.setVisible(false);
			}
		}
		// Xử lí sự kiên khi nhân vào nút đăng ký
		else if(command.equals(loginView.getBtnSignUp().getText()))
		{
			int status = JOptionPane.showConfirmDialog(loginView, "Bạn muốn đến trang đăng ký?", "Thông báo!", JOptionPane.OK_CANCEL_OPTION);
			if(status == 0) // Nhấn ok
			{
				SignUpView signUpView = new SignUpView();
				signUpView.setVisible(true);
				loginView.setVisible(false);				
			}
		}
	}

}
