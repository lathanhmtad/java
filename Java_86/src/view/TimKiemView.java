package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimKiemListener;
import model.TimKiemModel;

public class TimKiemView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TimKiemModel timKiemModel;
	private JTextArea jTextArea_vanBan;
	private JTextField jTextField_tuKhoa;
	private JLabel jLabel_ketQua;
	private TimKiemListener timKiemListener;
	
	public TimKiemView() throws HeadlessException {
		timKiemModel = new TimKiemModel();
		timKiemListener = new TimKiemListener(this);
		init();
	}
	
	private void init()
	{
		config();
		
		Font font = new Font("Arial", Font.BOLD, 30);
		
		JLabel jLabel_vanBan = new JLabel("Văn bản");
		jLabel_vanBan.setFont(font);
		jTextArea_vanBan = new JTextArea(100, 10);
		jTextArea_vanBan.setFont(font);
		
//		JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan);		
//		jScrollPane.setViewportView(jTextArea_vanBan);
		
		setLayout(new BorderLayout());
		add(jLabel_vanBan, BorderLayout.NORTH);
		add(jScrollPane, BorderLayout.CENTER);
		add(footer(), BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	private void config()
	{
		setTitle("Tìm kiếm");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JPanel footer()
	{
		Font font = new Font("Arial", Font.BOLD, 30);
		
		JLabel jLabel_tuKhoa = new JLabel("Từ khóa");
		jLabel_tuKhoa.setFont(font);
		jTextField_tuKhoa = new JTextField();
		jTextField_tuKhoa.setFont(font);
	
		JButton jButton_thongKe = new JButton("Thống kê");
		jButton_thongKe.setFont(font);
		jButton_thongKe.addActionListener(timKiemListener);
		jButton_thongKe.setForeground(Color.WHITE);
		jButton_thongKe.setBackground(Color.BLUE);
		
		jLabel_ketQua = new JLabel("Undefined");
		jLabel_ketQua.setBackground(Color.YELLOW);
		jLabel_ketQua.setFont(font);
		jLabel_ketQua.setOpaque(true);
		
		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2,2,20,20));
		jPanel_footer.add(jLabel_tuKhoa);
		jPanel_footer.add(jTextField_tuKhoa);
		jPanel_footer.add(jButton_thongKe);
		jPanel_footer.add(jLabel_ketQua);
		
		return jPanel_footer;
	}
	
	public void timKiem()
	{
		timKiemModel.setVanBan(jTextArea_vanBan.getText());
		timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
		timKiemModel.timKiem();
		jLabel_ketQua.setText(timKiemModel.getKetQua());
	}
	
	
	
}
