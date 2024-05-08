package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.UserDAO;
import model.User;
import view.LoginView;
import view.SignUpView;

public class SignUpController implements ActionListener {

	private SignUpView signUpView;
	private UserDAO userDAO;
	
	
	public SignUpController(SignUpView signUpView) {
		super();
		this.signUpView = signUpView;
		userDAO = new UserDAO();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		
		// Xử lí sự kiện nhấn vào nút sign up
		if(command.equals(signUpView.getBtnSignUp().getText()))
		{
			User newUser = signUpView.getUserInfoByForm();
			if(newUser == null)
				return;
			
			// Kiểm tra xem newUser đã có tồn tại trong db hay chưa
			User userFromDB = userDAO.getUserByAccount(newUser.getAccount());
			if(userFromDB == null) // Chưa tồn tại trong db thì đăng ký thành công
			{
				userDAO.insert(newUser);
				signUpView.showMessage("Chúc mừng bạn đã đăng kí thành công!", "Success");
				signUpView.deleteForm();
			}
			else
			{
				signUpView.showMessage("Tài khoản đã tồn tại vui lòng chọn 1 tài khoản khác!", "Error");
				System.out.println(userFromDB.toString());
			}
		}
		// Xử lí sự kiện nhấn vào nút đăng nhập
		else if(command.equals(signUpView.getBtnLogin().getText()))
		{
			int status = JOptionPane.showConfirmDialog(signUpView, "Bạn muốn quay về trang đăng nhập?", "Thông báo!", JOptionPane.OK_CANCEL_OPTION);
			if(status == 0) // Nhấn ok
			{
				LoginView loginView = new LoginView();
				loginView.setVisible(true);
				signUpView.setVisible(false);
			}
		}
	}

}
