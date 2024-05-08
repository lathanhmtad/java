package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import model.ThucDonModel;
import control.ThucDonController;

public class ThucDonView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ThucDonModel thucDonModel;
	public JLabel jLabel_ThongTin;
	public ArrayList<JCheckBox> list_buttonGroup_MonPhu;

	public JComboBox<String> jComboBox_MonChinh;
	public JList<String> jList_MonPhu;
	
	public ThucDonView()
	{
		thucDonModel = new ThucDonModel();
		init();
	}
	
	private void init()
	{
		setTitle("Thực Đơn");
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		Font font = new Font("Arial", Font.BOLD, 30);
		
		JLabel header = new JLabel("THỰC ĐƠN NHÀ HÀNG TITV");
		header.setFont(font);
		
		JPanel jPanel_TieuDe = new JPanel();
		jPanel_TieuDe.add(header);
		add(jPanel_TieuDe, BorderLayout.NORTH);
		
		
		JPanel jPanel_MonChinh = new JPanel();
//		jPanel_MonChinh.setBackground(Color.GREEN);
		jPanel_MonChinh.setLayout(new FlowLayout());
		String[] cacMonChinh = new String[] {"CƠM", "PHỞ", "BÁNH MỲ"};
		jComboBox_MonChinh = new JComboBox<String>(cacMonChinh);
		jComboBox_MonChinh.setFont(font);
		jPanel_MonChinh.add(jComboBox_MonChinh);
		
		JPanel jPanel_MonPhu = new JPanel();
		jPanel_MonPhu.setLayout(new GridLayout(2, 2));
		String[] cacMonPhu = new String[] {"TRÀ SỮA", "COCACOLA", "BÁNH NGỌT", "NEM"};
		jList_MonPhu = new JList<String>(cacMonPhu);
		jList_MonPhu.setFont(font);
		jPanel_MonPhu.add(jList_MonPhu);
		
		JPanel jPanel_luuChon = new JPanel(); 
		jPanel_luuChon.setLayout(new BorderLayout());
		jPanel_luuChon.add(jPanel_MonChinh, BorderLayout.NORTH);
		jPanel_luuChon.add(jPanel_MonPhu, BorderLayout.CENTER);
		add(jPanel_luuChon, BorderLayout.CENTER);
		
		JPanel jPanel_ThanhToan = new JPanel();
		jPanel_ThanhToan.setLayout(new GridLayout(1, 2));
		jLabel_ThongTin = new JLabel();
		jLabel_ThongTin.setForeground(Color.red);
		JButton jButton_ThanhToan = new JButton("Thanh Toán");
		jButton_ThanhToan.setFont(font);
		ActionListener thucDonController = new ThucDonController(this);
		jButton_ThanhToan.addActionListener(thucDonController);
		jPanel_ThanhToan.add(jLabel_ThongTin);
		jPanel_ThanhToan.add(jButton_ThanhToan);
		
		add(jPanel_ThanhToan, BorderLayout.SOUTH);
		
		
		setVisible(true);
	}

	public void hienThiKetQua() {
		// TODO Auto-generated method stub
		String kq = "Món chính: " + thucDonModel.getLuuChon_MonChinh()
					+ " Món phụ: " + thucDonModel.getLuuChon_MonPhu()
					+ " Tổng tiền: " + thucDonModel.getTongTien();
		
		jLabel_ThongTin.setText(kq);
		
	}
}
