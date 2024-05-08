package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import model.ThucDonModel;
import control.ThucDonController;

public class ThucDonView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ThucDonModel thucDonModel;

	public JRadioButton jRadioButton_com;
	public JRadioButton jRadioButton_pho;
	public JRadioButton jRadioButton_banhMi;

	public ButtonGroup buttonGroup_MonChinh;

	public JCheckBox jCheckBox_TraSua;
	public JCheckBox jCheckBox_CocaCola;
	public JCheckBox jCheckBox_BanhNgot;
	public JCheckBox jCheckBox_Nem;

	public ArrayList<JCheckBox> list_buttonGroup_MonPhu;

	public JLabel jLabel_ThongTin;
	
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
		jPanel_MonChinh.setLayout(new GridLayout(1, 3));
		jRadioButton_com = new JRadioButton("CƠM");
		jRadioButton_com.setFont(font);
		jRadioButton_pho = new JRadioButton("PHỞ");
		jRadioButton_pho.setFont(font);
		jRadioButton_banhMi = new JRadioButton("BÁNH MỲ");
		jRadioButton_banhMi.setFont(font);
		
		buttonGroup_MonChinh = new ButtonGroup();
		buttonGroup_MonChinh.add(jRadioButton_com);
		buttonGroup_MonChinh.add(jRadioButton_pho);
		buttonGroup_MonChinh.add(jRadioButton_banhMi);
		
		jPanel_MonChinh.add(jRadioButton_com);
		jPanel_MonChinh.add(jRadioButton_pho);
		jPanel_MonChinh.add(jRadioButton_banhMi);
		
		JPanel jPanel_MonPhu = new JPanel();
//		jPanel_MonPhu.setBackground(Color.YELLOW);
		jPanel_MonPhu.setLayout(new GridLayout(2, 2));
		jCheckBox_TraSua = new JCheckBox("Trà sửa");
		jCheckBox_TraSua.setFont(font);
		jCheckBox_CocaCola = new JCheckBox("Cocacola");
		jCheckBox_CocaCola.setFont(font);
		jCheckBox_BanhNgot = new JCheckBox("BÁNH NGỌT");
		jCheckBox_BanhNgot.setFont(font);
		jCheckBox_Nem = new JCheckBox("NEM");
		jCheckBox_Nem.setFont(font);
		list_buttonGroup_MonPhu = new ArrayList<JCheckBox>();
		list_buttonGroup_MonPhu.add(jCheckBox_TraSua);
		list_buttonGroup_MonPhu.add(jCheckBox_CocaCola);
		list_buttonGroup_MonPhu.add(jCheckBox_BanhNgot);
		list_buttonGroup_MonPhu.add(jCheckBox_Nem);
		
		jPanel_MonPhu.add(jCheckBox_TraSua);
		jPanel_MonPhu.add(jCheckBox_CocaCola);
		jPanel_MonPhu.add(jCheckBox_BanhNgot);
		jPanel_MonPhu.add(jCheckBox_Nem);
		
		JPanel jPanel_luuChon = new JPanel(); 
		jPanel_luuChon.setLayout(new GridLayout(2, 1));
		jPanel_luuChon.add(jPanel_MonChinh);
		jPanel_luuChon.add(jPanel_MonPhu);
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
