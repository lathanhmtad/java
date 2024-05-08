package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;

public class QLSVView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public QLSVModel qlsvModel;
	public JTextField textField_MaSinhVien;
	public JTable table;
	public JTextField textField_id;
	public JTextField textField_HoVaTen;
	public JTextField textField_ngaySinh;
	public JTextField textField_Mon1;
	public JTextField textField_Mon2;
	public JTextField textField_Mon3;
	public JRadioButton radioButton_nam;
	public ButtonGroup btn_gioiTinh;
	public JComboBox comboBox_QueQuan;
	public JRadioButton radioButton_nu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
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
	public QLSVView() {
		qlsvModel = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 993, 761);
		setLocationRelativeTo(null);
		
		ActionListener actionListener = new QLSVController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		menuFile.add(menuOpen);
		
		JMenu menuClose = new JMenu("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About me");
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_QueQuan = new JLabel("Qu\u00EA Qu\u00E1n");
		label_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_QueQuan.setBounds(46, 10, 105, 45);
		contentPane.add(label_QueQuan);
		
		JLabel label_MaThiSinh = new JLabel("M\u00E3 th\u00ED sinh");
		label_MaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_MaThiSinh.setBounds(418, 10, 105, 45);
		contentPane.add(label_MaThiSinh);
		
		textField_MaSinhVien = new JTextField();
		textField_MaSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_MaSinhVien.setColumns(10);
		textField_MaSinhVien.setBounds(533, 9, 221, 45);
		contentPane.add(textField_MaSinhVien);
		
		JButton btnNewButton = new JButton("T\u00ECm");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(806, 10, 125, 45);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox_QueQuan_TimKiem = new JComboBox();
		comboBox_QueQuan_TimKiem.setBounds(142, 10, 221, 35);
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_QueQuan_TimKiem.addItem("");
		for(Tinh tinh : listTinh)
		{
			comboBox_QueQuan_TimKiem.addItem(tinh.getTenTinh());
		}
		contentPane.add(comboBox_QueQuan_TimKiem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(44, 65, 887, 5);
		contentPane.add(separator_1);
		
		JLabel label_QueQuan_1 = new JLabel("Danh s\u00E1ch th\u00ED sinh");
		label_QueQuan_1.setForeground(new Color(255, 0, 0));
		label_QueQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_QueQuan_1.setBounds(10, 80, 151, 45);
		contentPane.add(label_QueQuan_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Th\u00ED Sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ngày sinh", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 121, 959, 249);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 380, 959, 5);
		contentPane.add(separator_1_1);
		
		JLabel label_QueQuan_2 = new JLabel("Thông tin thí sinh");
		label_QueQuan_2.setForeground(new Color(255, 0, 0));
		label_QueQuan_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_QueQuan_2.setBounds(10, 395, 199, 35);
		contentPane.add(label_QueQuan_2);
		
		JLabel label_id = new JLabel("Mã thí sinh");
		label_id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_id.setBounds(10, 440, 74, 19);
		contentPane.add(label_id);
		
		textField_id = new JTextField();
		textField_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_id.setColumns(10);
		textField_id.setBounds(125, 440, 156, 28);
		contentPane.add(textField_id);
		
		JLabel label_HoVaTen = new JLabel("Họ và tên");
		label_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_HoVaTen.setBounds(10, 482, 65, 19);
		contentPane.add(label_HoVaTen);
		
		textField_HoVaTen = new JTextField();
		textField_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_HoVaTen.setColumns(10);
		textField_HoVaTen.setBounds(125, 478, 156, 28);
		contentPane.add(textField_HoVaTen);
		
		JLabel label_queQuan = new JLabel("Quê quán");
		label_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_queQuan.setBounds(10, 521, 66, 19);
		contentPane.add(label_queQuan);
		
		JLabel label_ngaySinh = new JLabel("Ngày sinh");
		label_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_ngaySinh.setBounds(10, 565, 66, 19);
		contentPane.add(label_ngaySinh);
		
		textField_ngaySinh = new JTextField();
		textField_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_ngaySinh.setColumns(10);
		textField_ngaySinh.setBounds(125, 559, 156, 28);
		contentPane.add(textField_ngaySinh);
		
		comboBox_QueQuan = new JComboBox();
		comboBox_QueQuan.addItem("");
		for(Tinh tinh : listTinh)
		{
			comboBox_QueQuan.addItem(tinh.getTenTinh());
		}
		comboBox_QueQuan.setBounds(125, 516, 156, 28);
		contentPane.add(comboBox_QueQuan);
		
		JLabel label_id_1 = new JLabel("Giới tính");
		label_id_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_id_1.setBounds(521, 440, 74, 19);
		contentPane.add(label_id_1);
		
		radioButton_nam = new JRadioButton("Nam");
		radioButton_nam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton_nam.setBounds(626, 439, 79, 21);
		contentPane.add(radioButton_nam);
		
		radioButton_nu = new JRadioButton("Nữ");
		radioButton_nu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton_nu.setBounds(722, 439, 103, 21);
		contentPane.add(radioButton_nu);
		
		btn_gioiTinh = new ButtonGroup();
		btn_gioiTinh.add(radioButton_nam);
		btn_gioiTinh.add(radioButton_nu);
		
		JLabel label_HoVaTen_1 = new JLabel("Điểm môn 1");
		label_HoVaTen_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_HoVaTen_1.setBounds(521, 477, 82, 19);
		contentPane.add(label_HoVaTen_1);
		
		textField_Mon1 = new JTextField();
		textField_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon1.setColumns(10);
		textField_Mon1.setBounds(636, 473, 156, 28);
		contentPane.add(textField_Mon1);
		
		JLabel label_HoVaTen_1_1 = new JLabel("Điểm môn 2");
		label_HoVaTen_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_HoVaTen_1_1.setBounds(521, 516, 82, 19);
		contentPane.add(label_HoVaTen_1_1);
		
		textField_Mon2 = new JTextField();
		textField_Mon2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon2.setColumns(10);
		textField_Mon2.setBounds(636, 512, 156, 28);
		contentPane.add(textField_Mon2);
		
		JLabel label_HoVaTen_1_2 = new JLabel("Điểm môn 3");
		label_HoVaTen_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_HoVaTen_1_2.setBounds(521, 556, 82, 19);
		contentPane.add(label_HoVaTen_1_2);
		
		textField_Mon3 = new JTextField();
		textField_Mon3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon3.setColumns(10);
		textField_Mon3.setBounds(636, 550, 156, 28);
		contentPane.add(textField_Mon3);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(actionListener);
		btnThem.setForeground(Color.BLACK);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThem.setBackground(Color.RED);
		btnThem.setBounds(46, 636, 125, 45);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(actionListener);
		btnXoa.setForeground(Color.BLACK);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXoa.setBackground(Color.RED);
		btnXoa.setBounds(235, 636, 125, 45);
		contentPane.add(btnXoa);
		
		JButton btnCapNhap = new JButton("Cập nhập");
		btnCapNhap.addActionListener(actionListener);
		btnCapNhap.setForeground(Color.BLACK);
		btnCapNhap.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCapNhap.setBackground(Color.RED);
		btnCapNhap.setBounds(418, 636, 125, 45);
		contentPane.add(btnCapNhap);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(actionListener);
		btnLuu.setForeground(Color.BLACK);
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLuu.setBackground(Color.RED);
		btnLuu.setBounds(594, 636, 125, 45);
		contentPane.add(btnLuu);
		
		JButton btnHuyBo = new JButton("Hủy bỏ");
		btnHuyBo.addActionListener(actionListener);
		btnHuyBo.setForeground(Color.BLACK);
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyBo.setBackground(Color.RED);
		btnHuyBo.setBounds(769, 636, 125, 45);
		contentPane.add(btnHuyBo);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 621, 959, 5);
		contentPane.add(separator_1_1_1);
		
		
		setVisible(true);
	}

	public void xoaForm() {
		// TODO Auto-generated method stub
		textField_id.setText("");
		textField_HoVaTen.setText("");
		textField_ngaySinh.setText("");
		textField_Mon1.setText("");
		textField_Mon2.setText("");
		textField_Mon3.setText("");
		comboBox_QueQuan.setSelectedIndex(-1);
		btn_gioiTinh.clearSelection();
		
		
		
	}

	public void themHoacCapNhapThiSinh(ThiSinh ts) {
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if(!qlsvModel.kiemTraTonTai(ts))
		{
			qlsvModel.insert(ts);
			model_table.addRow(new Object[]{
					ts.getMaThiSinh() + "",
					ts.getTenThiSinh(),
					ts.getQueQuan().getTenTinh(),
					ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/" + (ts.getNgaySinh().getYear() + 1900) + "",
					(ts.isGioiTinh() ? "Nam" : "Nữ"),
					ts.getDiemMon1() + "",
					ts.getDiemMon2() + "",
					ts.getDiemMon3() + "",
			});	
			
		} 
		else
		{
			qlsvModel.update(ts);
			int soLuongDong = model_table.getRowCount();
			for(int i = 0; i < soLuongDong; i++)
			{
				String id = model_table.getValueAt(i, 0) + "";
				if(id.equals(ts.getMaThiSinh() + "")) {
					model_table.setValueAt(ts.getMaThiSinh() + "",i, 0);
					model_table.setValueAt(ts.getTenThiSinh() + "",i, 1);
					model_table.setValueAt(ts.getQueQuan().getTenTinh() + "",i, 2);
					model_table.setValueAt(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/" + (ts.getNgaySinh().getYear() + 1900) + "" + "",i, 3);
					model_table.setValueAt(ts.isGioiTinh() ? "Nam" : "Nữ" + "",i, 4);
					model_table.setValueAt(ts.getDiemMon1() + "",i, 5);
					model_table.setValueAt(ts.getDiemMon2() + "",i, 6);
					model_table.setValueAt(ts.getDiemMon3() + "",i, 7);
				}
			}
		}
		
	}
	
	public ThiSinh getThiSinhDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		model_table.getValueAt(i_row, 0);
		
		int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
		String tenThiSinh = model_table.getValueAt(i_row, 1) + "";
		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2) + "");
		String s_ngaySinh =model_table.getValueAt(i_row, 3) + "";
		Date ngaySinh = new Date(s_ngaySinh);
		String textGioiTinh = model_table.getValueAt(i_row, 4)  + "";
		boolean gioiTinh = textGioiTinh.equals("Nam");
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5) + "");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6) + "");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 6) + "");
		
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}
	
	public void hienThiThongTinThiSinhDaChon() {
		// TODO Auto-generated method stub
		ThiSinh ts = getThiSinhDangChon();
		
		textField_id.setText(ts.getMaThiSinh() + "");
		textField_HoVaTen.setText(ts.getTenThiSinh() + "");
		comboBox_QueQuan.setSelectedItem(ts.getQueQuan().getTenTinh());
		String ngaySinh = ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/" + (ts.getNgaySinh().getYear() + 1900);
		textField_ngaySinh.setText(ngaySinh + "");
		if(ts.isGioiTinh()) {
			radioButton_nam.setSelected(true);
		}
		else
		{
			radioButton_nu.setSelected(true);
		}
		textField_Mon1.setText(ts.getDiemMon1() + "");
		textField_Mon2.setText(ts.getDiemMon2() + "");
		textField_Mon3.setText(ts.getDiemMon3() + "");
	}

	public void thucHienXoa() {
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luuChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa dòng đã chọn");
		if(luuChon == JOptionPane.YES_OPTION) {
			ThiSinh ts = getThiSinhDangChon();
			model_table.removeRow(i_row);
			qlsvModel.remove(ts);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
